package com.moyu.bi.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * Created by Joker on 18/1/30.
 */
public class ParamsPackage {

    public static Map<String, Object> jsonToMap(String jsonStr) {
        JSONObject jsonObject = JSON.parseObject(jsonStr);
        Map<String, Object> map = jsonObject.toJavaObject(jsonObject, Map.class);
        return map;
    }
}
