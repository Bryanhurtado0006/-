package com.example.myapplicationics.Gamificacion_LUIS;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

import java.util.Random;

public class RuletaView extends View {

    private Paint paint;
    private RectF rectF;

    private String[] categorias = {
            "Lectura Crítica", "Química", "Sociales", "Inglés", "Matemáticas", "Aleatorio"
    };

    private int[] colores = {
            Color.GREEN, Color.BLUE, Color.MAGENTA, Color.RED, Color.YELLOW, Color.parseColor("#FFA500")
    };

    public String categoriaSeleccionada = "";
    private float currentAngle = 0f;

    public RuletaView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setAntiAlias(true);
        rectF = new RectF();
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
            paint.setColor(colores[i]);
            canvas.drawArc(rectF, i * sweepAngle, sweepAngle, true, paint);
            drawTextOnSector(canvas, categorias[i], i * sweepAngle + sweepAngle / 2, radius);
        }

        canvas.restore();

        // Círculo central
        paint.setColor(Color.LTGRAY);
        canvas.drawCircle(width / 2, height / 2, 50, paint);
    }

    private void drawTextOnSector(Canvas canvas, String text, float angleDeg, float radius) {
        double angleRad = Math.toRadians(angleDeg);
        float x = (float) (getWidth() / 2 + radius / 1.5 * Math.cos(angleRad));
        float y = (float) (getHeight() / 2 + radius / 1.5 * Math.sin(angleRad));

        paint.setColor(Color.BLACK);
        paint.setTextSize(24f);
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(text, x, y, paint);
    }

    public void girarRuleta() {
        Random random = new Random();

        int numCategorias = categorias.length;
        int categoriaGanadora = random.nextInt(numCategorias);
        float sweepAngle = 360f / numCategorias;
        float anguloCategoria = categoriaGanadora * sweepAngle + sweepAngle / 2;

        int vueltas = random.nextInt(3) + 5;
        float rotacionFinal = (vueltas * 360f) + (360f - anguloCategoria);

        ValueAnimator animator = ValueAnimator.ofFloat(currentAngle, currentAngle + rotacionFinal);
        animator.setDuration(3000);
        animator.setInterpolator(new DecelerateInterpolator());

        animator.addUpdateListener(animation -> {
            currentAngle = (float) animation.getAnimatedValue();
            invalidate();
        });

        animator.start();

        categoriaSeleccionada = categorias[categoriaGanadora];
    }
}
