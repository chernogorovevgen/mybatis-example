package com.chernogorov.repository.Impl;

import com.chernogorov.model.OrderModel;
import com.chernogorov.repository.OrderRepository;
import com.chernogorov.repository.mapper.OrderModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class OrderRepositoryImpl implements OrderRepository {


    private final OrderModelMapper modelMapper;

    @Autowired
    public OrderRepositoryImpl(OrderModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Transactional
    @Override
    public void save(OrderModel orderModel) {
        modelMapper.save(orderModel);
    }

    @Override
    public OrderModel findById(Long id) {
        return modelMapper.findById(id);
    }

    @Override
    public List<OrderModel> getAll() {
        return modelMapper.getAll();
    }
}
