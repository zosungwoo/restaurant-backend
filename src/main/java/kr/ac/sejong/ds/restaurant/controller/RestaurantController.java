package kr.ac.sejong.ds.restaurant.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kr.ac.sejong.ds.restaurant.dto.RestaurantResponseDto;
import kr.ac.sejong.ds.restaurant.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Tag(name = "레스토랑")
@RestController
@RequiredArgsConstructor
public class RestaurantController {
    private final RestaurantService restaurantService;

    @Operation(summary = "모든 레스토랑 조회")
    @GetMapping("/api/restaurants")
    public List<RestaurantResponseDto> getAllRestaurant() {
        List<RestaurantResponseDto> restaurantResponseDto = restaurantService.findRestaurants()
                .stream().map(RestaurantResponseDto::new).collect(Collectors.toList());
        return restaurantResponseDto;
    }
}
