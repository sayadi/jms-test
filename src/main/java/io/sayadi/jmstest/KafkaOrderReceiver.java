package io.sayadi.jmstest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaOrderReceiver implements OrderReceiver {

    @Override
    public Order receiveOrder() {

        log.info("Dummy impl since kafka template provides no pull receive functions.");
        return null;
    }
}
