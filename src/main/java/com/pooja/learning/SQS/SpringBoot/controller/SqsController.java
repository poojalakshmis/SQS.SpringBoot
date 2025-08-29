package com.pooja.learning.SQS.SpringBoot.controller;
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/sqs")
public class SqsController {
    private final QueueService queueService;

    @PostMapping("/send")
    public ResponseEntity<String> send(@RequestBody Map<String, Object> payload) throws JsonProcessingException {
        String message = new ObjectMapper().writeValueAsString(payload);
        String messageId = queueService.sendMessage(message);
        return ResponseEntity.ok("Message sent with ID: " + messageId);
    }
}
