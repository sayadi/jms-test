//package io.sayadi.jmstest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.stereotype.Service;
//
//import javax.jms.Destination;
//
//@Service
//public class JmsOrderMessagingService implements OrderMessagingService {
//
//    private final JmsTemplate jms;
//    private final Destination orderQueue;
//
//    @Autowired
//    public JmsOrderMessagingService(
//            JmsTemplate jms,
//            Destination orderQueue) {
//
//        this.jms = jms;
//        this.orderQueue = orderQueue;
//    }
//
//    @Override
//    public void sendOrder(Order order) {
//
//        jms.convertAndSend(orderQueue, order);
//    }
//}
