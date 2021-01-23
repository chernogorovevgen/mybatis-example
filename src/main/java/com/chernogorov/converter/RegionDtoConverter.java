package com.chernogorov.converter;


import com.chernogorov.dto.RegionDto;
import com.chernogorov.model.RegionModel;
import org.springframework.stereotype.Service;

@Service
public class RegionDtoConverter {

    public RegionModel convert(RegionDto dto) {

        RegionModel region = new RegionModel();
        region.setId(dto.getId());
        region.setCode(dto.getCode());
        region.setName(dto.getName());

        return region;

    }

    public RegionDto convert(RegionModel region) {

        RegionDto dto = new RegionDto();
        dto.setId(region.getId());
        dto.setCode(region.getCode());
        dto.setName(region.getName());

        return dto;

    }

}
