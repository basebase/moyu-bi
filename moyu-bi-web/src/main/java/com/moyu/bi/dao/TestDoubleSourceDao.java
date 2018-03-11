package com.moyu.bi.dao;

import com.moyu.bi.web.configuration.DevRepository;
import com.moyu.bi.web.configuration.ManageRepository;

import java.util.List;

/**
 * Created by Joker on 18/3/11.
 */
@DevRepository
//@ManageRepository
public interface TestDoubleSourceDao {
    List<Integer> testJoin();
}
