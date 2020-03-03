package com.handen.Nodes;

import com.handen.Context;
import com.handen.strategies.DrawParallelogramStrategy;
import com.handen.strategies.DrawTextStrategy;

public class SoutNode extends SingleNode {

    public SoutNode(String line) {
        super(line);
    }

    @Override
    public String getText() {
        String text = "sout(" + line.substring(line.indexOf("(") + 1, line.lastIndexOf(")")) + ")";
        return text;
    }

    @Override
    public Context draw(Context context) {
        context.setStrategy(new DrawParallelogramStrategy());
        context.drawCurrentStrategy();

        context.setStrategy(new DrawTextStrategy(getText()));
        context.drawCurrentStrategy();
        return context;
    }
}
