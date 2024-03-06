package kr.ac.sejong.ds.restaurant.service;

import kr.ac.sejong.ds.restaurant.domain.Restaurant;
import kr.ac.sejong.ds.restaurant.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    public List<Restaurant> findRestaurants(){
        return restaurantRepository.findAll();
    }

    public List<Restaurant> findRestaurantsByBorough(String borough){
        return restaurantRepository.findByAddressContaining(borough);
    }

    public List<Restaurant> findRestaurantsByIds(List<Long> restaurantIds){
        return restaurantRepository.findByIdIn(restaurantIds);
    }
}
