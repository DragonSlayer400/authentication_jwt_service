package ru.dragon.develop.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.dragon.develop.dto.AuthenticationRequestDto;
import ru.dragon.develop.dto.AuthenticationResponseDto;
import ru.dragon.develop.service.UserService;

@RestController
@AllArgsConstructor
public class AuthController {

    private UserService userService;

    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public AuthenticationResponseDto login(
            @RequestBody AuthenticationRequestDto request
    ){
        return new AuthenticationResponseDto();
    }

}
