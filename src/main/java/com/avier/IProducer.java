package com.avier;

public interface IProducer {
    <T> void publishMessage(T message);
}
