package com.moyu.bi.dao;

import com.moyu.bi.web.configuration.DevRepository;

/**
 * Created by Joker on 18/1/13.
 */
@DevRepository
public interface UserDao {
    Integer findUserCount();
}
