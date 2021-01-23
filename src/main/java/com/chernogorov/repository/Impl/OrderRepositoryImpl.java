package com.chernogorov.repository.Impl;

import com.chernogorov.model.OrderModel;
import com.chernogorov.repository.OrderRepository;
import com.chernogorov.repository.mapper.OrderModelMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
//@AllArgsConstructor
@RequiredArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {


    private final OrderModelMapper orderModelMapper;

//    public OrderRepositoryImpl(OrderModelMapper orderModelMapper) {
//        this.orderModelMapper = orderModelMapper;
//    }

    @Transactional
    @Override
    public void save(OrderModel orderModel) {

        Optional.ofNullable(orderModel.getRegion())
                .ifPresent(region -> {
                    orderModel.setRegionId(region.getId());
                });

        orderModelMapper.save(orderModel);
    }

    @Override
    public OrderModel findById(Long id) {
        return orderModelMapper.findById(id);
    }

    @Override
    public List<OrderModel> getAll() {
        return orderModelMapper.getAll();
    }

}
