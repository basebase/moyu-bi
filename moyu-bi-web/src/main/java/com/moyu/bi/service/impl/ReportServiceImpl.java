package com.moyu.bi.service.impl;

import com.moyu.bi.common.ParamsPackage;
import com.moyu.bi.dao.ReportDao;
import com.moyu.bi.domain.report.Report;
import com.moyu.bi.service.ReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Joker on 18/1/29.
 */

@Service
public class ReportServiceImpl implements ReportService {

    @Resource
    private ReportDao reportDao;

    @Override
    public void getReportData(Report report) {

        report.setTableName(report.getTableName().replaceAll("\"", ""));



        Map<String, Object> transverseMap = ParamsPackage.jsonToMap(report.getTransverse());
        Map<String, Object> longitudinalMap = ParamsPackage.jsonToMap(report.getLongitudinal());


        Map<String, Object> whereMap = new HashMap<String, Object>();
        Map<String, Object> columnMap = new HashMap<String, Object>();


        for (Map.Entry<String, Object> m : transverseMap.entrySet()) {
            if (m.getValue().equals("notwhere")) {
                columnMap.put(m.getKey(), m.getValue());
            } else {
                whereMap.put(m.getKey(), m.getValue());
            }
        }

        report.setTransverseWhereMap(whereMap);
        report.setTransverseColumnMap(columnMap);

        report.setLongitudinaMap(longitudinalMap);

        reportDao.getReportData(report);
    }
}
