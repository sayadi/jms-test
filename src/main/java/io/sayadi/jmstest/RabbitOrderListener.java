//package io.sayadi.jmstest;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//@Slf4j
//@Component
//public class RabbitOrderListener implements OrderListener {
//
//
//    @Override
//    @RabbitListener(queues = {"jmstest.order.queue"})
//    public void logOrder(Order order) {
//
//        log.info("Received order: " + order);
//    }
//}
