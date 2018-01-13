package com.moyu.bi.service.impl;

import com.moyu.bi.dao.UserDao;
import com.moyu.bi.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Joker on 18/1/13.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public Integer findUserCount() {
        return userDao.findUserCount();
    }
}
