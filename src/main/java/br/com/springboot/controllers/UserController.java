package br.com.springboot.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.model.User;
import br.com.springboot.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

  private List<User> users = new ArrayList<>();

  @Autowired
  private UserRepository userRepository;

  @GetMapping("/{id}")
  public User user(@PathVariable("id") Long id) {
    Optional <User> userFind = users.stream().filter(user -> user.getId() = id).findFirst();

    if(userFind.isPresent()) {
      return userFind.get();
    }
    
    return null;
  }

  @PostMapping("/")
  public User user(@RequestBody User user) {
    return this.userRepository.save(user);
  }

  @GetMapping("/list")
  public List<User> list() {
    return users;
  }
}