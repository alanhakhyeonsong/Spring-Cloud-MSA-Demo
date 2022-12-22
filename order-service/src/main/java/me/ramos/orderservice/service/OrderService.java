package me.ramos.orderservice.service;

import me.ramos.orderservice.dto.OrderDto;
import me.ramos.orderservice.entity.OrderEntity;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDetails);
    OrderDto getOrderByOrderId(String orderId);
    Iterable<OrderEntity> getOrdersByUserId(String userId);
}
