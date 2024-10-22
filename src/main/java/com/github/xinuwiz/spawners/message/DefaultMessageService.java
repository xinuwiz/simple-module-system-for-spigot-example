package com.github.xinuwiz.spawners.message;

import java.util.HashSet;
import java.util.Set;

public class DefaultMessageService implements MessageService {

    private final Set<MessageListenerState> states;

    public DefaultMessageService() {
        states = new HashSet<>();
    }

    @Override
    public <T> void send(T object) {
        for (MessageListenerState state : states) {
            if (state.isDeaf())
                continue;
            object = state.getListener().onReceive(object);
        }
    }

    @Override
    public <T extends MessageListener> void register(T listener) {
        final MessageListenerState state = new MessageListenerState(listener);
        states.add(state);
    }
}
