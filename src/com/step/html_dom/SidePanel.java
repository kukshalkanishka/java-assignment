package com.step.html_dom;

import java.util.ArrayList;
import java.util.List;

public class SidePanel implements Node {
    List<Leaf> htmlDoms;

    SidePanel() {
        this.htmlDoms = new ArrayList<>();
    }
    @Override
    public Node addElement(Leaf element) {
        this.htmlDoms.add(element);
        return this;
    }

    @Override
    public String refresh() {
        StringBuilder message = new StringBuilder("Refreshing SidePanel");
        for (Leaf dom : this.htmlDoms) {
            message.append(dom.refresh());
        }
        return message.toString();
    }

}
