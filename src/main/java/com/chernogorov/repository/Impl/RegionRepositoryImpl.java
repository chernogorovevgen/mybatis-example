package com.chernogorov.repository.Impl;

import com.chernogorov.model.RegionModel;
import com.chernogorov.repository.RegionRepository;
import com.chernogorov.repository.mapper.RegionModelMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class RegionRepositoryImpl implements RegionRepository {

    private final RegionModelMapper regionModelMapper;

    @Override
    public RegionModel findById(Long id) {
        return regionModelMapper.findById(id);
    }
}
