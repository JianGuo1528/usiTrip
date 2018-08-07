package com.usitrip.dao;

import com.usitrip.pojo.PnlAirport;
import com.usitrip.pojo.VoQuery;

import java.util.List;

public interface PnlAirportMapper {
    public PnlAirport findByIATA(String iata);

    public List<PnlAirport> findAll();

    public List<PnlAirport> findByCountryAndDesId(VoQuery voQuery);

}
