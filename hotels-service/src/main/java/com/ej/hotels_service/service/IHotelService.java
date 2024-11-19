package com.ej.hotels_service.service;

import com.ej.hotels_service.model.Hotel;

import java.util.List;

public interface IHotelService {

    public List<Hotel> getHotelsByCityId(Long city_id);

}
