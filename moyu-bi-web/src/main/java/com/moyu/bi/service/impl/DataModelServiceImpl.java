package com.moyu.bi.service.impl;

import com.moyu.bi.dao.DataModelDao;
import com.moyu.bi.domain.datamodel.DataModel;
import com.moyu.bi.service.DataModelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public List<DataModel> showDataModelList() {
        List<DataModel> res = dataModelDao.showDataModelList();
        return res;
    }

    @Override
    public DataModel showDataModelById(DataModel dataModel) {
        DataModel tagDataModel = dataModelDao.showDataModelById(dataModel);
        return tagDataModel;
    }

    @Override
    public void updateDataModel(DataModel dataModel) {
        dataModelDao.updateDataModel(dataModel);
    }

    @Override
    public void delDataModel(DataModel dataModel) {
        dataModelDao.delDataModel(dataModel);
    }

    @Override
    public DataModel genTree(DataModel dataModel) {
        DataModel tagDataModel = dataModelDao.genTree(dataModel);
        return tagDataModel;
    }

    @Override
    public String getDataModelTable(DataModel dataModel) {
        String tableName = dataModelDao.getDataModelTable(dataModel);
        return tableName;
    }
}
