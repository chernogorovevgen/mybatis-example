package com.chernogorov.converter;


import com.chernogorov.dto.OrderDto;
import com.chernogorov.model.OrderModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderDtoConverter {

    private final RegionDtoConverter regionDtoConverter;


    public OrderModel convert(OrderDto dto){

        OrderModel orderModel = new OrderModel();
        orderModel.setId(dto.getId());
        orderModel.setNumber(dto.getNumber());
        orderModel.setTimestamp(dto.getTimestamp());

       // orderModel.setRegion(regionDtoConverter.convert(dto.getRegion()));

        return orderModel;

    }


    public OrderDto convert(OrderModel orderModel){

        OrderDto dto = new OrderDto();
        dto.setId(orderModel.getId());
        dto.setNumber(orderModel.getNumber());
        dto.setTimestamp(orderModel.getTimestamp());

        //dto.setRegion(regionDtoConverter.convert(orderModel.getRegion()));

        return dto;

    }

}
