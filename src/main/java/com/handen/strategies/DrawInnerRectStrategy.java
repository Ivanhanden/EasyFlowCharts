package com.handen.strategies;

import com.handen.utils.Point;

import javafx.scene.canvas.GraphicsContext;

import static com.handen.Nodes.AbstractNode.BLOCK_HEIGHT;
import static com.handen.Nodes.AbstractNode.BLOCK_WIDTH;

public class DrawInnerRectStrategy implements DrawStrategy {
    @Override
    public Point draw(GraphicsContext gc, Point p) {
        int startX = p.x + BLOCK_WIDTH / 10;
        int width = BLOCK_WIDTH - BLOCK_WIDTH / 5;
        gc.strokeRect(startX, p.y, width, BLOCK_HEIGHT);
        return p;
    }
}
