package com.step.html_dom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyTest {

    @Test
    void shouldRefreshAllComponentsUnderContent() {
        Leaf image = new Image();
        Leaf text = new Text();
        Node content = new Content();
        content.addElement(image);
        content.addElement(text);

        String expected = "Refreshing ContentsRefreshing ImageRefreshing Text";
        assertEquals(expected, content.refresh());

    }
    @Test
    void shouldRefreshAllComponentsUnderBody() {
        Node sidePanel = new SidePanel();
        Node bottomPanel = new BottomPanel();
        Node body = new Body();

        Leaf image = new Image();
        Leaf text = new Text();
        Node content = new Content();

        content.addElement(image);
        content.addElement(text);

        body.addElement(sidePanel);
        body.addElement(content);
        body.addElement(bottomPanel);


        String expected = "Refreshing BodyRefreshing SidePanelRefreshing ContentsRefreshing ImageRefreshing TextRefreshing BottomPanel";
        assertEquals(expected, body.refresh());

    }
}