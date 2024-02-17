package kr.ac.sejong.ds.restaurant.repository;

import kr.ac.sejong.ds.restaurant.domain.Restaurant;
import kr.ac.sejong.ds.restaurant.domain.RestaurantPopularDish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantPopularDishRepository extends JpaRepository<RestaurantPopularDish, Long> {
}
