package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Transactional

    @Override
    public User findById(Long id) {
        return userDao.findById(id);
    }

    @Transactional

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void delete(long id) {
        userDao.delete(id);
    }

    @Transactional
    @Override
    public void edit(User user) {
        userDao.edit(user);
    }
}
