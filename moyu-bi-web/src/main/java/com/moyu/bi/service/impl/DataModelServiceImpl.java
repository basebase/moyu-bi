package com.moyu.bi.service.impl;

import com.moyu.bi.dao.DataModelDao;
import com.moyu.bi.domain.datamodel.DataModel;
import com.moyu.bi.service.DataModelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Joker on 18/1/25.
 */
@Service
public class DataModelServiceImpl implements DataModelService {

    @Resource
    private DataModelDao dataModelDao;

    @Override
    public void saveDataModel(DataModel dataModel) {
        dataModelDao.saveDataModel(dataModel);
    }
}
