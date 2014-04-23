package com.wayso.soapbox;

public class Message {

    private String title;
    private String author;
    private String body;

    public Message(String title, String author, String body) {
        this.title = title;
        this.author = author;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

}
