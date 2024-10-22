package com.github.xinuwiz.spawners.message;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public final class NullMessageService implements MessageService {

    @Override
    public <T> void send(T object) {
        throw new NotImplementedException();
    }

    @Override
    public <T extends MessageListener> void register(T listener) {
        throw new NotImplementedException();
    }
}