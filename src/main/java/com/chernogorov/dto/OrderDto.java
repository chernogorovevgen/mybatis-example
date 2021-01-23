package com.chernogorov.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

@JsonSerialize
@JsonDeserialize
@Data
public class OrderDto implements Serializable {

    private Long id;
    @NotEmpty
    private String number;
    @NotEmpty
    private Date timestamp;

    private RegionDto region;

}
