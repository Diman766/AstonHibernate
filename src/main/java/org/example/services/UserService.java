package org.example.services;

import org.example.dao.UserDao;
import org.example.models.User;

import java.util.List;

public class UserService {


    private static UserDao usersDao = new UserDao();

    public UserService() {
    }

    public static User findUser(Long id) {
        return usersDao.findById(id);
    }

    public void saveUser(User user) {
        usersDao.save(user);
    }

    public void deleteUser(User user) {
        usersDao.delete(user);
    }

    public void updateUser(User user) {
        usersDao.update(user);
    }

    public List<User> findAllUsers() {
        return usersDao.findAll();
    }

}
