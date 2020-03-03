package com.handen.strategies;

import com.handen.utils.Point;

import javafx.scene.canvas.GraphicsContext;

import static com.handen.Nodes.AbstractNode.BLOCK_HEIGHT;
import static com.handen.Nodes.AbstractNode.BLOCK_WIDTH;
import static com.handen.Nodes.AbstractNode.LOOP_BLOCK_OFFSET;

public class DrawOpenLoopPolygonStrategy implements DrawStrategy {
    @Override
    public Point draw(GraphicsContext gc, Point p) {
        int offset = LOOP_BLOCK_OFFSET;
        //counter clockwise
        gc.strokeLine(p.x + offset, p.y, p.x, p.y + offset);
        gc.strokeLine(p.x, p.y + offset, p.x, p.y + BLOCK_HEIGHT);
        gc.strokeLine(p.x, p.y + BLOCK_HEIGHT, p.x + BLOCK_WIDTH, p.y + BLOCK_HEIGHT);
        gc.strokeLine(p.x + BLOCK_WIDTH, p.y + BLOCK_HEIGHT, p.x + BLOCK_WIDTH, p.y + offset);
        gc.strokeLine(p.x + BLOCK_WIDTH, p.y + offset, p.x + BLOCK_WIDTH - offset, p.y);
        gc.strokeLine(p.x + BLOCK_WIDTH - offset, p.y, p.x + offset, p.y);
        return p;
    }
}