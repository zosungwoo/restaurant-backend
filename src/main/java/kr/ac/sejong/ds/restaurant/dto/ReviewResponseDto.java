package kr.ac.sejong.ds.restaurant.dto;

import kr.ac.sejong.ds.restaurant.domain.Review;
import kr.ac.sejong.ds.restaurant.domain.User;
import lombok.Getter;

@Getter
public class ReviewResponseDto {
    private Long id;
    private Double rating;
    private String reviewText;
    private UserResponseDto userResponseDto;


    public ReviewResponseDto(Review review) {
        this.id = review.getId();
        this.rating = review.getRating();
        this.reviewText = review.getReviewText();
        this.userResponseDto = new UserResponseDto(review.getUser());
    }
}
