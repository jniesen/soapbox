package com.wayso.soapbox;

public class Message {

    private Persister persister;

    public Message(Persister persister) {
        this.persister = persister;
    }

    public void publish() {
        this.persister.save();
    }

}
