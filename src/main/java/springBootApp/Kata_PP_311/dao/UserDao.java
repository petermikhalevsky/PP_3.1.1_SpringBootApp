package springBootApp.Kata_PP_311.dao;

import java.util.List;


import springBootApp.Kata_PP_311.models.User;

public interface UserDao {


    void add(User user);
    List<User> listUsers();
    void removeUserById(Long id);
    User findUser(Long id);
    void update(User user);

}
