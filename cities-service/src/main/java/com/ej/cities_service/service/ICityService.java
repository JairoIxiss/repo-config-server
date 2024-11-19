package com.ej.cities_service.service;

import com.ej.cities_service.dto.CityDTO;

public interface ICityService {

    public CityDTO getCitiesHotels(String name, String country);

}
