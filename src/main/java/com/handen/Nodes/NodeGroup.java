package com.handen.Nodes;

public abstract class NodeGroup extends AbstractNode {

    public NodeGroup(String line) {
        super(line);
    }

    abstract public void addNode(AbstractNode node);
}
