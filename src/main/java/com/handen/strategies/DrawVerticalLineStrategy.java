package com.handen.strategies;

import com.handen.utils.Point;

import javafx.scene.canvas.GraphicsContext;

import static com.handen.Nodes.AbstractNode.BLOCK_WIDTH;

public class DrawVerticalLineStrategy implements DrawStrategy {

    private int length;

    public DrawVerticalLineStrategy(int length) {
        this.length = length;
    }

    @Override
    public Point draw(GraphicsContext gc, Point p) {
        gc.strokeLine(p.x + BLOCK_WIDTH / 2, p.y, p.x + BLOCK_WIDTH / 2, p.y + length);
        p.y = p.y + length;
        return p;
    }
}