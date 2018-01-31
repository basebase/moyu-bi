package com.moyu.bi.dao;

import com.moyu.bi.domain.report.Report;
import com.moyu.bi.web.configuration.DevRepository;

import java.util.List;
import java.util.Map;

/**
 * Created by Joker on 18/1/29.
 */
@DevRepository
public interface ReportDao {
    List<Map<String, String>> getReportData(Report report);
}
