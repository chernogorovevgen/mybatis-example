package com.chernogorov.repository.mapper;

import com.chernogorov.model.RegionModel;
import org.apache.ibatis.annotations.Param;

public interface RegionModelMapper {

    RegionModel findById(@Param("id") Long id);

}
