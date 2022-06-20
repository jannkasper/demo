package com.example.demo.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

  private UserRepository userRepository;

  public User getUser(long id) {
    return userRepository.findById(id).orElse(null);
  }

  public User saveUser(User newUser) {
    return userRepository.save(newUser);
  }

}
