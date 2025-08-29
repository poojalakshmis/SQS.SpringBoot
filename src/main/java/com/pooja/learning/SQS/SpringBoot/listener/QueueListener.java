package com.pooja.learning.SQS.SpringBoot.listener;

@Component
public class QueueListener {

    @SqsListener("my-springboot-queue")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}