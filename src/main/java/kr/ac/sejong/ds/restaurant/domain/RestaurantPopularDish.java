package kr.ac.sejong.ds.restaurant.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "Restaurant_popular_dish")
public class RestaurantPopularDish {

    @Id
    @GeneratedValue
    @Column(name = "dish_id")
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
}
