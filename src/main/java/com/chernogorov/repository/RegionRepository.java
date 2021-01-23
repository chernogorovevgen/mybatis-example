package com.chernogorov.repository;

import com.chernogorov.model.RegionModel;

public interface RegionRepository {

    RegionModel findById(Long id);

}
