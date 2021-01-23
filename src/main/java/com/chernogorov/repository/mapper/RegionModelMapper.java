package com.chernogorov.repository.mapper;

import com.chernogorov.model.RegionModel;
import org.apache.ibatis.annotations.Param;

public interface RegionModelMapper {

    RegionModel getById(@Param("id") long id);

}
