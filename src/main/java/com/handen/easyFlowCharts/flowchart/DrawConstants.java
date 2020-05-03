package com.handen.easyFlowCharts.flowchart;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

public class DrawConstants {

    public static final int LIST_WIDTH = 2480;
    public static final int LIST_HEIGHT = 3508;
    public static final int LIST_LEFT_OFFSET = 100;
    public static final int LIST_RIGHT_OFFSET = 100;
    public static final int LIST_TOP_OFFSET = 250;
    public static final int LIST_BOTTOM_OFFSET = 250;

    public static final int BLOCK_HEIGHT = 150;
    public static final int BLOCK_WIDTH = 300;
    public static final int THEN_ARROW_LENGTH = BLOCK_WIDTH;
    public static final int LOOP_BLOCK_OFFSET = (int) (BLOCK_WIDTH * 0.2);
    public static final int ARROW_LENGTH = 50;
    public static final Paint FILL_COLOR = Color.BLACK;
    public static final Paint STROKE_COLOR = Color.BLACK;
    public static final int FONT_SIZE = 28;
    public static final Font FONT = Font.font("Verdana", FONT_SIZE);
    public static final int MAX_SYMBOLS_IN_LINE = 25;
    public static final int LINE_MARGIN = 2;
    public static final int LINE_WIDTH = 2;
    public static final int METHOD_OFFSET = 200;
}
