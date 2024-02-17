package kr.ac.sejong.ds.restaurant.service;

import kr.ac.sejong.ds.restaurant.domain.Review;
import kr.ac.sejong.ds.restaurant.repository.ReviewRepository;
import kr.ac.sejong.ds.restaurant.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public List<Review> findReviewByRestaurant(Long restaurantId){
        return reviewRepository.findAllByRestaurantId(restaurantId);
    }
}
