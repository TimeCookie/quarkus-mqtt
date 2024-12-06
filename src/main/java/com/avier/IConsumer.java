package com.avier;

public interface IConsumer {
    <T> void receiveMessage(T message);
}
