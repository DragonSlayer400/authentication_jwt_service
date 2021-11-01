package ru.dragon.develop.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dragon.develop.entity.User;
import ru.dragon.develop.repository.UserRepo;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepo userRepo;

    public User getByLogin(String login){
        return userRepo.findByLogin(login).orElse(null);
    }

}
