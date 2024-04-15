package org.dtlk.analyticsandrecommendationservice.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    @KafkaListener(topics = "books-event", groupId = "analytics-and-recommendations-group-id")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
