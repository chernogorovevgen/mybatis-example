package com.chernogorov.model;


import lombok.Data;

import java.util.Date;

@Data
public class OrderModel {

    private Long id;
    private String number;
    private Date timestamp;
    private Long regionId;
    private RegionModel region;


}
