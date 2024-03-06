package kr.ac.sejong.ds.restaurant.dto.model;

import lombok.Data;

import java.util.List;

@Data
public class RecommendedRestaurantDto {
    private Long user_num;
    private List<Long> result;
}
