package kr.ac.sejong.ds.restaurant.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Reviews {
    
    @Id @GeneratedValue
    private Long id;
    
    private Double rating;

    private String review_text;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurants restaurants;
}
