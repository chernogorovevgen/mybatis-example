package com.chernogorov.controller;

import com.chernogorov.model.OrderModel;
import com.chernogorov.repository.OrderRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/order")
//TODO: название похоже на объект траспорта, лучше по другому назвать класс
public class OrderController {


    private OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @GetMapping("/add/{number}")
    public void add(@PathVariable("number") String number) {

        OrderModel orderModel = new OrderModel();
        orderModel.setNumber(number);
        orderModel.setTimestamp(System.currentTimeMillis());
        orderModel.setRegionCode(number);

        orderRepository.save(orderModel);

    }

    @GetMapping("/find/{id}")
    public OrderModel findById(@PathVariable("id") Long id){
        return orderRepository.findById(id);
    }

    @GetMapping("/all")
    public List<OrderModel> getAll(){
        return orderRepository.getAll();
    }


}
