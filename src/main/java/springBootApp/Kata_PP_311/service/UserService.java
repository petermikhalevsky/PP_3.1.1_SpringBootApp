package springBootApp.Kata_PP_311.service;

import springBootApp.Kata_PP_311.models.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    void removeUserById(Long id);
    User findUser(Long id);
    void update(User changedUser);



}
