package com.text.dao;

import com.text.entity.User;

public interface UserDao {
    public User findByName(String username);
}

