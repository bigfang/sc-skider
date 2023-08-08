package io.fang.account.controller;

import io.fang.account.dto.LoginDto;
import io.fang.account.dto.SignupDto;
import io.fang.account.model.User;
import io.fang.account.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@Tag(name = "认证")
class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    User signup(@RequestBody SignupDto dto) {
        return userService.signup(dto);
    }

    @PostMapping("/login")
    User login(@RequestBody LoginDto dto) {
        return userService.login(dto);
    }

    @PostMapping("/logout")
    Boolean logout() {
        return true;
    }

}
