package com.company.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MessageProducer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@Value("${app.kafka.topic}")
	private String topic;

	public void sendMessage(String message) {
		kafkaTemplate.send(topic, message);
	}
}
