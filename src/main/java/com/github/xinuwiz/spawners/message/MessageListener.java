package com.github.xinuwiz.spawners.message;

public interface MessageListener {

    <T> T onReceive(T object);

}