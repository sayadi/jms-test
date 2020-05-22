//package io.sayadi.jmstest;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jms.support.converter.MessageConverter;
//import org.springframework.messaging.converter.MappingJackson2MessageConverter;
//
//import javax.jms.Destination;
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//public class JmsConfig {
//
//    @Bean
//    public Destination orderQueue() {
//
//        return new ActiveMQQueue("jmstest.order.queue");
//    }
//
//    @Bean
//    public MessageConverter messageConverter() {
//
//        MappingJackson2MessageConverter messageConverter = new MappingJackson2MessageConverter();
//
//        messageConverter.set("_typeId");
//        Map<String, Class<?>> typeIdMappings = new HashMap<>();
//        typeIdMappings.put("order", Order.class);
//        messageConverter.setTypeIdMappings(typeIdMappings);
//
//        return messageConverter;
//    }
//}
