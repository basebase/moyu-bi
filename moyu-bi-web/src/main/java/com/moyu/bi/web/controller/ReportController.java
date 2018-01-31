package com.moyu.bi.web.controller;

import com.moyu.bi.common.ParamsPackage;
import com.moyu.bi.domain.report.Report;
import com.moyu.bi.domain.view.ResponseResult;
import com.moyu.bi.service.ReportService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
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
    public ResponseResult<List<Map<String, String>>> getReportData(@RequestBody Report report) {
        try {
            List<Map<String, String>> reportData = reportService.getReportData(report);
            return ResponseResult.successReturn(reportData);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("获取数据失败");
        }
    }
}
