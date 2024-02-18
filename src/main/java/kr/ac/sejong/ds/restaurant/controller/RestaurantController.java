package kr.ac.sejong.ds.restaurant.controller;

import kr.ac.sejong.ds.restaurant.dto.RestaurantResponseDto;
import kr.ac.sejong.ds.restaurant.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class RestaurantController {
    private final RestaurantService restaurantService;

    @GetMapping("/api/restaurants")
    public List<RestaurantResponseDto> getAllRestaurant() {
        List<RestaurantResponseDto> restaurantResponseDto = restaurantService.findRestaurants()
                .stream().map(RestaurantResponseDto::new).collect(Collectors.toList());
        return restaurantResponseDto;
    }
}
