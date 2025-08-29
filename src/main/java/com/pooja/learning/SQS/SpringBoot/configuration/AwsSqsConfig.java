package com.pooja.learning.SQS.SpringBoot.configuration;

@Configuration
public class AwsSqsConfig {
    @Bean
    public SqsClient sqsClient() {
        return SqsClient.builder()
                .region(Region.of("ap-southeast-2")) // Your AWS region
                .build();
    }
}
