package com.moyu.bi.web.controller;

import com.moyu.bi.domain.datamodel.DataModel;
import com.moyu.bi.domain.view.ResponseResult;
import com.moyu.bi.service.DataModelService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Joker on 18/1/25.
 */
@RestController
@RequestMapping("/api")
public class DataModelController {
    private static final Logger LOGGER = Logger.getLogger(DataModelController.class);

    @Resource
    private DataModelService dataModelService;

    @RequestMapping("/saveDataModel")
    public ResponseResult<String> saveDataModel(@RequestBody DataModel dataModel) {
        try {
            dataModelService.saveDataModel(dataModel);
            return ResponseResult.successReturn("数据模型保存成功");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("保存失败, 请和管理员联系.!");
        }
    }

    @RequestMapping("/showDataModelList")
    public ResponseResult<List<DataModel>> showDataModelList() {
        try {
            List<DataModel> res = dataModelService.showDataModelList();
            return ResponseResult.successReturn(res);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("展示失败, 请和管理员联系.!");
        }
    }


    @RequestMapping("/showDataModel")
    public ResponseResult<DataModel> showDataModel(@RequestBody DataModel dataModel) {
        try {
            DataModel res = dataModelService.showDataModelById(dataModel);
            return ResponseResult.successReturn(res);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("展示失败, 请和管理员联系.!");
        }
    }

}
