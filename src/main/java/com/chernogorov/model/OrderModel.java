package com.chernogorov.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderModel {

    private long id;
    private String number;
    private long timestamp;
    private String prefix;


}
