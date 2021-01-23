package com.chernogorov.converter;


import com.chernogorov.dto.RegionDto;
import com.chernogorov.model.RegionModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class RegionDtoConverter {


    public RegionModel convert(RegionDto dto) {

        RegionModel region = new RegionModel();
        region.setId(dto.getId());
        region.setKode(dto.getKode());
        region.setName(dto.getName());

        return region;

    }


    public RegionDto convert(RegionModel region) {

        RegionDto dto = new RegionDto();
        dto.setId(region.getId());
        dto.setKode(region.getKode());
        dto.setName(region.getName());

        return dto;

    }

}
