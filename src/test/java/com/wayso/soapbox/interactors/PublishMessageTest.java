package com.wayso.soapbox.interactors;

import com.wayso.soapbox.Message;
import com.wayso.soapbox.MessageRepository;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class PublishMessageTest {

    @Test
    public void callsPublishOnMessageRepositoryWithMessageParameters() {
        MessageRepository msgRepo = mock(MessageRepository.class);
        Message msg = mock(Message.class);
        PublishMessage msgPublisher = new PublishMessage(msg, msgRepo);
        msgPublisher.publish();
        verify(msgRepo).publish(msg);
    }
}
