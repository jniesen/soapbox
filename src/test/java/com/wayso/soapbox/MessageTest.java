package com.wayso.soapbox;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageTest {

    @Test
    public void hasTitle() {
        Message message = new Message("Some title");
        assertEquals("Some title", message.getTitle());
    }

}
