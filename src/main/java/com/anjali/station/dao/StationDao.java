package com.anjali.station.dao;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anjali.station.model.Station;

@Repository
public interface StationDao<T extends Station,Integer extends Serializable> extends CrudRepository<T, Integer> {
	public Optional<Station> findByStationName(String stationName);
}
