package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/user")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("{id}")
  public User getUser(@PathVariable long id) {
    return userService.getUser(id);
  }

  @GetMapping("test")
  public User getUser() {
    userService.saveUser(new User().setName("Marcin").setAge(22));
    userService.saveUser(new User().setName("Tomek").setAge(93));
    return userService.saveUser(new User().setName("Jan").setAge(18));
  }

  @PostMapping
  public User saveUser(@RequestBody User newUser) {
    return userService.saveUser(newUser);
  }


}
