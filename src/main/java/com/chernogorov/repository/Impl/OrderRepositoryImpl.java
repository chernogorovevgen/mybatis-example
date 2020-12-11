package com.chernogorov.repository.Impl;

import com.chernogorov.model.OrderModel;
import com.chernogorov.repository.OrderRepository;
import com.chernogorov.repository.mapper.OrderModelMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

    // тут можно без @Autowired т.к. ты бин инициализируешь через конструктор
    private final OrderModelMapper modelMapper;

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
