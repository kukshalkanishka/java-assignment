package com.step.html_dom;

import java.util.ArrayList;
import java.util.List;

public class Content implements Node {
    List<Leaf> htmlDoms;

    Content() {
        this.htmlDoms = new ArrayList<>();
    }

    @Override
    public String refresh() {
        StringBuilder message = new StringBuilder("Refreshing Contents");
        for (Leaf dom : this.htmlDoms) {
            message.append(dom.refresh());
        }
        return message.toString();
    }

    @Override
    public Node addElement(Leaf element) {
        this.htmlDoms.add(element);
        return this;
    }
}
