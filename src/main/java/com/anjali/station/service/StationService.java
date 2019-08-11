package com.anjali.station.service;

import java.util.List;
import java.util.Map;

import com.anjali.station.model.Station;
import com.anjali.station.vo.StationVo;

public interface StationService {
	Map<String, Object> createStation(StationVo stationVo);
	Map<String, Object> readStation(Integer id);
	Map<String, Object> getStationId(String station_name);
	Map<String, Object> updateStation(StationVo stationVo);
	Map<String, Object> deleteStation(Integer id);
	List<Station> listStation();
}
