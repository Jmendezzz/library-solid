package org.example.application.adapters.usecases;

import org.example.application.ports.usecases.UserService;
import org.example.domain.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserServiceAdapter implements UserService {
  private List<User> users;
  public UserServiceAdapter() {
    this.users = new ArrayList<>();
  }
  @Override
  public void create(User user) {
    users.add(user);
  }

  @Override
  public Optional<User> getUserByFirstName(String firstName) {
    return users.stream()
            .filter(user -> user.getFirstName().equals(firstName))
            .findFirst();
  }

  @Override
  public List<User> getAllUsers() {
    return users;
  }
}
