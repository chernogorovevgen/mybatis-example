package com.chernogorov.controller;

import com.chernogorov.converter.RegionDtoConverter;
import com.chernogorov.dto.RegionDto;
import com.chernogorov.model.RegionModel;
import com.chernogorov.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/region")
@RequiredArgsConstructor
public class RegionController {

    private final RegionService regionService;
    private final RegionDtoConverter regionDtoConverter;

    @GetMapping("{id}")
    public RegionDto findById(@PathVariable("id") Long id){
        RegionModel regionModel = regionService.findById(id);
        return regionDtoConverter.convert(regionModel);
    }

}
