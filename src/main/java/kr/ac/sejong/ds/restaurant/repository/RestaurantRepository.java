package kr.ac.sejong.ds.restaurant.repository;

import kr.ac.sejong.ds.restaurant.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    List<Restaurant> findByAddressContaining(String borough);
    List<Restaurant> findByIdIn(List<Long> restaurantIds);
}
