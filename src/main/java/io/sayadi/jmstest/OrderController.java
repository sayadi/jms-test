package io.sayadi.jmstest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderMessagingService orderMessagingService;
    private final OrderReceiver orderReceiver;

    @Autowired
    public OrderController(
            OrderMessagingService orderMessagingService,
            OrderReceiver orderReceiver) {

        this.orderMessagingService = orderMessagingService;
        this.orderReceiver = orderReceiver;
    }

    @GetMapping("send")
    public void sendOrder() {

        Order order = Order.builder()
                .id(1L)
                .name("Test Order")
                .placedAt(new Date())
                .build();

        orderMessagingService.sendOrder(order);
    }

    @GetMapping("receive")
    public Order receiveOrder() {

        return orderReceiver.receiveOrder();
    }
}
