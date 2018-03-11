package com.moyu.bi.web.controller;

import com.moyu.bi.service.TestDoubleSourceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Joker on 18/3/11.
 */
@RestController
@RequestMapping("/api")
public class TestDoubleSourceController {

    @Resource
    private TestDoubleSourceService testDoubleSourceService;

    @RequestMapping("/testDoubleSource")
    public void testDoubleSource() {
        List<Integer> datas = testDoubleSourceService.testJoin();
        System.out.println("GO.!");
    }
}
