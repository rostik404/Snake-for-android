package com.test.snake;

import android.graphics.Canvas;

/**
 * Created by Ростислав on 09.04.2016.
 */
public class DrawOnCanvas implements DrawBehavior {

    private Snake snake;

    public DrawOnCanvas(Snake snake) {
        this.snake = snake;
    }

    public void drawLine(float x1, float y1, float x2, float y2) {
        Animation.canvas.drawLine(x1, y1, x2, y2, snake.getPaint());
    }

    public void drawCircle(float x, float y, float r) {
        Animation.canvas.drawCircle(x, y, r, snake.getPaint());
    }
}