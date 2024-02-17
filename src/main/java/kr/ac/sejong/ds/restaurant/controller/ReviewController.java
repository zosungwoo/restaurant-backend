package kr.ac.sejong.ds.restaurant.controller;

import kr.ac.sejong.ds.restaurant.domain.Review;
import kr.ac.sejong.ds.restaurant.dto.ReviewResponseDto;
import kr.ac.sejong.ds.restaurant.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;

    @GetMapping("/api/restaurant/{restaurantId}/reviews")
    public List<ReviewResponseDto> reviewsByRestaurant(@PathVariable("restaurantId") Long restaurantId) {
        List<ReviewResponseDto> reviewResponseDto = reviewService.findReviewByRestaurant(restaurantId)
                .stream().map(ReviewResponseDto::new).collect(Collectors.toList());
        return reviewResponseDto;
    }

}
