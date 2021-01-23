package com.chernogorov.service;

import com.chernogorov.controller.RegionController;
import com.chernogorov.model.RegionModel;
import com.chernogorov.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionService {

    private RegionRepository regionRepository;

    @Autowired
    public RegionService(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    public RegionModel findById(Long id){
        return regionRepository.findById(id);
    }
}
