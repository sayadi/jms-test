//package io.sayadi.jmstest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.stereotype.Service;
//
//import javax.jms.Destination;
//import javax.jms.JMSException;
//
//@Service
//public class JmsOrderReceiver implements OrderReceiver {
//
//    private final JmsTemplate jms;
//    private final Destination orderQueue;
//
//    @Autowired
//    public JmsOrderReceiver(
//            JmsTemplate jms,
//            Destination orderQueue) {
//
//        this.jms = jms;
//        this.orderQueue = orderQueue;
//    }
//
//    @Override
//    public Order receiveOrder() {
//
//        return (Order) jms.receiveAndConvert(orderQueue);
//    }
//}
