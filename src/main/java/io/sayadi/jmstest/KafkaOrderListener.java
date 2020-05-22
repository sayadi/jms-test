package io.sayadi.jmstest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaOrderListener implements OrderListener {

    @Override
    @KafkaListener(id = "foo2", topics = "jmstest.order.queue")
    public void logOrder(Order order) {

        log.info("Received order: " + order);
    }
}
