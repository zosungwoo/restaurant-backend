package kr.ac.sejong.ds.restaurant.dto;

import kr.ac.sejong.ds.restaurant.domain.Review;
import kr.ac.sejong.ds.restaurant.domain.User;
import lombok.Getter;

@Getter
public class UserResponseDto {
    private Long id;
    private String name;
    private boolean elite;

    public UserResponseDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.elite = user.getElite();
    }
}
