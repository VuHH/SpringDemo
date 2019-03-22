package com.example.demo.tacos.data;

import com.example.demo.tacos.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
    //Order save(Order order);
    //List<Order> findByDeliveryZip(String deliveryZip);
    //List<Order> readOrdersByDeliveryZipAndPlacedAtBetween(String deliveryZip, Date startDate, Date endDate);
}
