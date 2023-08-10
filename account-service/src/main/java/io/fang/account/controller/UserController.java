package io.fang.account.controller;

import io.fang.account.model.User;
import io.fang.account.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/users")
@Tag(name = "用户")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String Test(@Value("${hello}") String hello) {
        return hello;
    }

    @GetMapping("")
    public List<User> findAll() {
        return userService.findAll();
    }
}
