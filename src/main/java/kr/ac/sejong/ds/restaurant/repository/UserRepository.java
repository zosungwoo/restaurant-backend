package kr.ac.sejong.ds.restaurant.repository;

import kr.ac.sejong.ds.restaurant.domain.Restaurant;
import kr.ac.sejong.ds.restaurant.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
