package kr.ac.sejong.ds.restaurant.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Users {

    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    private String name;

    private boolean is_elite;
}
