package kr.ac.sejong.ds.restaurant.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Review {
    
    @Id @GeneratedValue
    @Column(name = "review_id")
    private Long id;
    
    private Double rating;

    private String review_text;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
}
