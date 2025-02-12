package org.springjdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springjdbc.dao.UserDao;
import org.springjdbc.entity.User;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public int registerUser(User user) {
        int i = userDao.saveUser(user);
        return i;
    }

}