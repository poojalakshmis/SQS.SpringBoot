package com.pooja.learning.SQS.SpringBoot.service;

@Service
@RequiredArgsConstructor
public class QueueService {
    private final SqsClient sqsClient;

    private final String queueUrl = "https://sqs.ap-southeast-2.amazonaws.com/363305613755/my-springboot-queue";

    public String sendMessage(String message) {
        SendMessageRequest request = SendMessageRequest.builder()
                .queueUrl(queueUrl)
                .messageBody(message)
                .build();
        return sqsClient.sendMessage(request).messageId();
    }
}
