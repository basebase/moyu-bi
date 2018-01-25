package com.moyu.bi.service;

import com.moyu.bi.domain.datamodel.DataModel;

import java.util.List;

/**
 * Created by Joker on 18/1/25.
 */
public interface DataModelService {
    void saveDataModel(DataModel dataModel);
    List<DataModel> showDataModelList();
}
