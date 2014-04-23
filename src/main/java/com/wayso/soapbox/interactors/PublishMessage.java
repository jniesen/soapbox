package com.wayso.soapbox.interactors;

import com.wayso.soapbox.Message;
import com.wayso.soapbox.MessageRepository;

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
