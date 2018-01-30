package com.moyu.bi.dao;

import com.moyu.bi.domain.report.Report;
import com.moyu.bi.web.configuration.DevRepository;

/**
 * Created by Joker on 18/1/29.
 */
@DevRepository
public interface ReportDao {
    void getReportData(Report report);
}
