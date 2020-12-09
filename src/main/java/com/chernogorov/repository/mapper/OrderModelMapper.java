package com.chernogorov.repository.mapper;


import com.chernogorov.model.OrderModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderModelMapper {

    void save(@Param("orderModel") OrderModel orderModel);

    OrderModel findById(@Param("id") Long id);

    List<OrderModel> getAll();


}
