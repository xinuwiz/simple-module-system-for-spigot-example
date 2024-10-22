package com.github.xinuwiz.spawners.message;

public class MessageListenerState {

    private final MessageListener listener;
    private boolean deaf;

    public MessageListenerState(MessageListener listener) {
        this.listener = listener;
        this.deaf = false;
    }

    public MessageListener getListener() {
        if (this.listener instanceof OnceMessageListener) deaf = true;
        return listener;
    }

    public boolean isDeaf() {
        return deaf;
    }
}