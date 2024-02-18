package kr.ac.sejong.ds.restaurant.dto;

import kr.ac.sejong.ds.restaurant.domain.Restaurant;
import kr.ac.sejong.ds.restaurant.domain.RestaurantPopularDish;
import lombok.Getter;

@Getter
public class RestaurantPopularDishResponseDto {
    private Long id;
    private String name;

    public RestaurantPopularDishResponseDto(RestaurantPopularDish restaurantPopularDish) {
        this.id = restaurantPopularDish.getId();
        this.name = restaurantPopularDish.getName();
    }
}
