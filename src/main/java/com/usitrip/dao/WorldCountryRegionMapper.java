package com.usitrip.dao;

import com.usitrip.pojo.WorldCountryRegion;

import java.util.List;

public interface WorldCountryRegionMapper {
    List<WorldCountryRegion> selectAllRegion();

    void updateAllRegion(List<WorldCountryRegion> list);
}
