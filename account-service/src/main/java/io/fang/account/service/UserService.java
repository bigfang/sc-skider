package io.fang.account.service;

import io.fang.account.dto.LoginDto;
import io.fang.account.dto.SignupDto;
import io.fang.account.model.User;
import io.fang.account.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User signup(SignupDto dto) {
        return null;
    }

    public User login(LoginDto dto) {
        return null;
    }
}
