package kr.ac.sejong.ds.restaurant.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Restaurant {

    @Id
    @GeneratedValue
    @Column(name = "restaurant_id")
    private Long id;

    private String name;

    private Long review_count;

    @Column(name = "average_rating")
    private Double averageRating;

    private String address;

    private Double lat;

    private Double lng;
}
