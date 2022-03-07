package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    User findById(Long id);
    void add(User user);
    void delete(long id);
    void edit(User user);
}
