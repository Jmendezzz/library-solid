package org.example.application.ports.usecases;

import org.example.domain.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
  void create(User user);
  Optional<User> getUserByFirstName(String firstName);
  List<User> getAllUsers();
}
