package com.moyu.bi.service;

import com.moyu.bi.domain.report.Report;

import java.util.List;
import java.util.Map;

/**
 * Created by Joker on 18/1/29.
 */
public interface ReportService {
    List<Map<String, String>> getReportData(Report report);
}
