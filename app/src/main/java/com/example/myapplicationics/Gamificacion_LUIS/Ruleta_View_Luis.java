package com.example.myapplicationics.Gamificacion_LUIS;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

import java.util.Random;

public class Ruleta_View_Luis extends View {

    private Paint paint;
    private RectF rectF;
    private Paint textPaint;
    private Paint borderPaint;

    private String[] categorias = {
            "Lectura Crítica", "Química", "Sociales", "Inglés", "Matemáticas", "Aleatorio"
    };

    private int[] colores = {
            Color.parseColor("#A5D6A7"),
            Color.parseColor("#90CAF9"),
            Color.parseColor("#CE93D8"),
            Color.parseColor("#EF9A9A"),
            Color.parseColor("#FFF59D"),
            Color.parseColor("#FFCC80")
    };

    private int categoriaSeleccionadaIndex = -1;
    private String categoriaSeleccionada = "";
    private float currentAngle = 0f;

    public Ruleta_View_Luis(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        rectF = new RectF();

        textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        textPaint.setColor(Color.BLACK);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));

        borderPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        borderPaint.setColor(Color.WHITE);
        borderPaint.setStyle(Paint.Style.STROKE);
        borderPaint.setStrokeWidth(4f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float width = getWidth();
        float height = getHeight();
        float radius = Math.min(width, height) / 2 - 20;

        rectF.set(width / 2 - radius, height / 2 - radius, width / 2 + radius, height / 2 + radius);
        float sweepAngle = 360f / categorias.length;

        canvas.save();
        canvas.rotate(currentAngle, width / 2, height / 2);

        for (int i = 0; i < categorias.length; i++) {
            if (i == categoriaSeleccionadaIndex) {
                paint.setColor(Color.RED); // Color especial para la categoría seleccionada
            } else {
                paint.setColor(colores[i]);
            }

            canvas.drawArc(rectF, i * sweepAngle, sweepAngle, true, paint);
            canvas.drawArc(rectF, i * sweepAngle, sweepAngle, true, borderPaint);
            drawTextOnSector(canvas, categorias[i], i * sweepAngle + sweepAngle / 2, radius);
        }

        canvas.restore();

        // Centro "GO"
        paint.setColor(Color.WHITE);
        canvas.drawCircle(width / 2, height / 2, 60, paint);
        paint.setColor(Color.DKGRAY);
        paint.setTextSize(26f);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        canvas.drawText("GO", width / 2, height / 2 + 10, paint);
    }

    private void drawTextOnSector(Canvas canvas, String text, float angleDeg, float radius) {
        double angleRad = Math.toRadians(angleDeg);
        float x = (float) (getWidth() / 2 + radius / 1.5 * Math.cos(angleRad));
        float y = (float) (getHeight() / 2 + radius / 1.5 * Math.sin(angleRad));

        textPaint.setTextSize(radius / 10);
        canvas.drawText(text, x, y, textPaint);
    }

    public void girarRuleta(Runnable onFinish) {
        Random random = new Random();

        int vueltas = random.nextInt(3) + 5;
        float sweepAngle = 360f / categorias.length;

        int indexFinal = random.nextInt(categorias.length); // igualdad de probabilidades
        float anguloObjetivo = 360 - (indexFinal * sweepAngle + sweepAngle / 2);

        float rotacionExtra = vueltas * 360 + anguloObjetivo;

        float inicio = currentAngle;
        float destino = currentAngle + rotacionExtra;

        ValueAnimator animator = ValueAnimator.ofFloat(inicio, destino);
        animator.setDuration(3000);
        animator.setInterpolator(new DecelerateInterpolator());

        animator.addUpdateListener(animation -> {
            currentAngle = (float) animation.getAnimatedValue();
            invalidate();
        });

        animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                categoriaSeleccionadaIndex = indexFinal;
                categoriaSeleccionada = categorias[categoriaSeleccionadaIndex];
                invalidate(); // para repintar con color destacado
                if (onFinish != null) onFinish.run();
            }
        });

        animator.start();
    }

    public String getCategoriaSeleccionada() {
        return categoriaSeleccionada;
    }
}
