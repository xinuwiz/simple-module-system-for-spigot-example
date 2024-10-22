package com.github.xinuwiz.spawners.message;

public interface MessageService {

    <T> void send(T object);

    <T extends MessageListener> void register(T listener);

}