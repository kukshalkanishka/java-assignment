package com.step.html_dom;

import java.util.ArrayList;
import java.util.List;

public class BottomPanel implements Node {
    List<Leaf> htmlDoms;

    BottomPanel() {
        this.htmlDoms = new ArrayList<>();
    }
    @Override
    public Node addElement(Leaf element) {
        this.htmlDoms.add(element);
        return this;
    }

    @Override
    public String refresh() {
        StringBuilder message = new StringBuilder("Refreshing BottomPanel");
        for (Leaf dom : this.htmlDoms) {
            message.append(dom.refresh());
        }
        return message.toString();
    }
}
