/*
 * package com.company.kafka;
 * 
 * import org.springframework.kafka.annotation.KafkaListener; import
 * org.springframework.stereotype.Component; import lombok.extern.slf4j.Slf4j;
 * 
 * @Component
 * 
 * @Slf4j public class MessageConsumer {
 * 
 * @KafkaListener(topics = "${app.kafka.topic}", groupId = "stack") public void
 * consume(String message) { // log.info("Kafka logs -> " + message);
 * System.out.print(message); }
 * 
 * }
 */