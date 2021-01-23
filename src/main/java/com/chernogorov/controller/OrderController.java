package com.chernogorov.controller;

import com.chernogorov.converter.OrderDtoConverter;
import com.chernogorov.dto.OrderDto;
import com.chernogorov.model.OrderModel;
import com.chernogorov.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final OrderDtoConverter orderDtoConverter;

    @GetMapping("/{id}")
    public OrderDto findById(@PathVariable("id") Long id){
        OrderModel orderModel = orderService.findById(id);
        return orderDtoConverter.convert(orderModel);
    }


    @PostMapping("/save")
    public void createOrder(@Valid @RequestBody OrderDto orderDto) {
        OrderModel orderModel = orderDtoConverter.convert(orderDto);
        orderService.save(orderModel);

    }

    @GetMapping("/all")
    public List<OrderDto> getAll(){

        List<OrderModel> orderList = orderService.getAll();

        List<OrderDto> orderDtoList = new ArrayList<>(orderList.size());

        for (OrderModel orderModel : orderList) {
            orderDtoList.add(orderDtoConverter.convert(orderModel));
        }

        return orderDtoList;
    }


}
