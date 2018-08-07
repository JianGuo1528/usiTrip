package com.usitrip.dao;

import com.usitrip.pojo.HotelbedsMapZoneUs;

import java.util.List;

public interface HotelbedsMapZoneUsMapper {
    List<HotelbedsMapZoneUs> selectZoneNameNonQuery();

    void batchUpdateFullAddress(List<HotelbedsMapZoneUs> hotelbedsMapZoneUslist);
}
