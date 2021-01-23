package com.chernogorov.service;

import com.chernogorov.model.OrderModel;
import com.chernogorov.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
//@RequiredArgsConstructor
//@AllArgsConstructor
public class OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Transactional
    public void save(OrderModel order) {
        orderRepository.save(order);
    }

    public OrderModel findById(Long id) {
        return orderRepository.findById(id);
    }

    public List<OrderModel> getAll(){
        return orderRepository.getAll();
    }



}
