//package io.sayadi.jmstest;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.stereotype.Component;
//
//@Slf4j
//@Component
//public class JmsOrderListener implements OrderListener {
//
//    @Override
//    @JmsListener(destination = "jmstest.order.queue")
//    public void logOrder(Order order) {
//
//        log.info("Order received: " + order);
//    }
//}
