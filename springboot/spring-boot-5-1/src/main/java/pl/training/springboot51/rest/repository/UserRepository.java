package pl.training.springboot51.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.training.springboot51.rest.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
