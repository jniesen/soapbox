package com.wayso.soapbox;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class MessageTest {

    @Test
    public void usesPersisterToPublish() {
        Persister persister = mock(Persister.class);
        Message message = new Message(persister);
        message.publish();

        verify(persister, times(1)).save();
    }

}
