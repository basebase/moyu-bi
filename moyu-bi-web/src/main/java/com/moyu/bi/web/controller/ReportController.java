package com.moyu.bi.web.controller;

import com.moyu.bi.common.ParamsPackage;
import com.moyu.bi.domain.report.Report;
import com.moyu.bi.domain.view.ResponseResult;
import com.moyu.bi.service.ReportService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by Joker on 18/1/29.
 */
@RestController
@RequestMapping("/api")
public class ReportController {
    private static final Logger LOGGER = Logger.getLogger(ReportController.class);

    @Resource
    private ReportService reportService;

    @RequestMapping("/getReportData")
    public ResponseResult getReportData(@RequestBody Report report) {
        try {
            reportService.getReportData(report);

            return null;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("获取数据失败");
        }
    }
}
