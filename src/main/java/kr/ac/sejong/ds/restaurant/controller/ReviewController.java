package kr.ac.sejong.ds.restaurant.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import kr.ac.sejong.ds.restaurant.domain.Review;
import kr.ac.sejong.ds.restaurant.dto.ReviewResponseDto;
import kr.ac.sejong.ds.restaurant.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Tag(name = "리뷰")
@RestController
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;

    @Operation(summary = "레스토랑 id에 따른 리뷰 조회")
    @GetMapping("/api/restaurants/{restaurantId}/reviews")
    public List<ReviewResponseDto> getAllReviewByRestaurant(@Parameter(description = "레스토랑 id") @PathVariable("restaurantId") Long restaurantId) {
        List<ReviewResponseDto> reviewResponseDto = reviewService.findReviewByRestaurant(restaurantId)
                .stream().map(ReviewResponseDto::new).collect(Collectors.toList());
        return reviewResponseDto;
    }

}
