package com.text.Service;

import com.text.dao.UserDao;
import com.text.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User login(String username, String password) {
        User user = userDao.findByName(username);
        if (user.getPassword().equals((password))) {
            return user;
        }
        return null;
    }
}
