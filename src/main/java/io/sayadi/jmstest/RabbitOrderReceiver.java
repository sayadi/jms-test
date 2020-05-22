//package io.sayadi.jmstest;
//
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.amqp.support.converter.MessageConverter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class RabbitOrderReceiver implements OrderReceiver {
//
//    private final RabbitTemplate rabbit;
//    private final MessageConverter messageConverter;
//
//    @Autowired
//    public RabbitOrderReceiver(
//            RabbitTemplate rabbit,
//            MessageConverter messageConverter) {
//
//        this.rabbit = rabbit;
//        this.messageConverter = messageConverter;
//    }
//
//    @Override
//    public Order receiveOrder() {
//
//        Message message = rabbit.receive();
//
//        return message != null
//                ? (Order) messageConverter.fromMessage(message) :
//                null;
//    }
//}
