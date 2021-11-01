package ru.dragon.develop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dragon.develop.entity.User;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByLogin(String login);
}
