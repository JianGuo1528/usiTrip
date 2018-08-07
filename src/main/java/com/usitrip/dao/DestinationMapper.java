package com.usitrip.dao;

import com.usitrip.pojo.Destination;
import com.usitrip.pojo.VoQuery;

import java.util.List;

public interface DestinationMapper {
    public Destination findById(Integer desId);

    public List<Destination> findByCountryIdAndDisplay(VoQuery voQuery);
}
