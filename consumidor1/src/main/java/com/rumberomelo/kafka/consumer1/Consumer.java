package com.rumberomelo.kafka.consumer1;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
private final Logger logger = LoggerFactory.getLogger(Consumer.class);
@KafkaListener(topics = "TOPIC_EJEMPLO", groupId = "group_id")
public void consume(String message){
logger.info("Se ha consumido el mensaje " + message);
}
}
