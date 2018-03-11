package com.moyu.bi.service.impl;

import com.moyu.bi.dao.TestDoubleSourceDao;
import com.moyu.bi.service.TestDoubleSourceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Joker on 18/3/11.
 */
@Service
public class TestDoubleSourceServiceImpl implements TestDoubleSourceService {

    @Resource
    private TestDoubleSourceDao testDoubleSourceDao;

    @Override
    public List<Integer> testJoin() {
        List<Integer> datas = testDoubleSourceDao.testJoin();
        return datas;
    }
}
