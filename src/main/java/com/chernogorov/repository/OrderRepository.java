package com.chernogorov.repository;

import com.chernogorov.model.OrderModel;

import java.util.List;
import java.util.Map;

public interface OrderRepository {

    void save(OrderModel orderModel);

    OrderModel findById(Long id);

    List<OrderModel> getAll();

}
