package kr.ac.sejong.ds.restaurant.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Restaurants {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Long review_count;

    private Double average_rating;

    private String address;

    private Double lat;

    private Double lng;
}
