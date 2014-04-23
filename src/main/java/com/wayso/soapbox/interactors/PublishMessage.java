package com.wayso.soapbox.interactors;

import com.wayso.soapbox.entities.Message;
import com.wayso.soapbox.entities.MessageRepository;

public class PublishMessage {
    public Message msg;
    public MessageRepository msgRepo;

    public PublishMessage(Message msg, MessageRepository msgRepo) {
        this.msg = msg;
        this.msgRepo = msgRepo;
    }

    public void publish() {
        msgRepo.publish(msg);
    }
}
