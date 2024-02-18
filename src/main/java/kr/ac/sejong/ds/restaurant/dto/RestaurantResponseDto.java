package kr.ac.sejong.ds.restaurant.dto;

import kr.ac.sejong.ds.restaurant.domain.Restaurant;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class RestaurantResponseDto {
    private Long id;
    private String name;
    private Long review_count;
    private Double averageRating;
    private String address;
    private Double lat;
    private Double lng;
    private List<RestaurantPopularDishResponseDto> restaurantPopularDishResponseDto;

    public RestaurantResponseDto(Restaurant restaurant) {
        this.id = restaurant.getId();
        this.name = restaurant.getName();
        this.review_count = restaurant.getReview_count();
        this.averageRating = restaurant.getAverageRating();
        this.address = restaurant.getAddress();
        this.lat = restaurant.getLat();
        this.lng = restaurant.getLng();
        this.restaurantPopularDishResponseDto = restaurant.getRestaurantPopularDishes()
                .stream().map(RestaurantPopularDishResponseDto::new).collect(Collectors.toList());
    }
}
