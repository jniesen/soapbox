package com.wayso.soapbox;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageTest {

    @Test
    public void hasTitleAndAuthorContent() {
        Message message = new Message("Some Title", "Some Author", "Some message content.");
        assertEquals("Some Title", message.getTitle());
        assertEquals("Some Author", message.getAuthor());
        assertEquals("Some message content.", message.getBody());
    }

}
