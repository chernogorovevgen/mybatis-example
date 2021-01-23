package com.chernogorov.dto;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonSerialize
@JsonDeserialize
public class RegionDto implements Serializable {

    private Long id;
    private String code;
    private String name;


}
