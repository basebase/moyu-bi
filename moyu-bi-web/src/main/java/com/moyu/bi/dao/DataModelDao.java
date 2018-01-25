package com.moyu.bi.dao;

import com.moyu.bi.domain.datamodel.DataModel;
import com.moyu.bi.web.configuration.DevRepository;

import java.util.List;

/**
 * Created by Joker on 18/1/25.
 */
@DevRepository
public interface DataModelDao {
    void saveDataModel(DataModel dataModel);
    List<DataModel> showDataModelList();
}
