package kr.ac.sejong.ds.restaurant.repository;

import kr.ac.sejong.ds.restaurant.domain.Restaurant;
import kr.ac.sejong.ds.restaurant.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    @Query("select r from Review r join fetch r.user where r.restaurant.id = :restaurantId")
    List<Review> findAllByRestaurantId(@Param("restaurantId") Long restaurantId);
}
