package com.moyu.bi.web.controller;

import com.moyu.bi.common.upload.FileUploadUtils;
import com.moyu.bi.domain.upload.UploadFile;
import com.moyu.bi.domain.view.ResponseResult;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


/**
 * Created by Joker on 18/1/9.
 */
@RestController
@RequestMapping("/api")
public class UploadFileController {

    private static final Logger LOGGER = Logger.getLogger(UploadFileController.class);

    private static final String UPLOAD_PATH = "./csv/";

    @RequestMapping(value = "/csv_upload", method = RequestMethod.POST)
    public ResponseResult<String> uploadCsvFile(@ModelAttribute UploadFile uploadFile) {
        LOGGER.debug("文件开始上传");
        try {
            FileUploadUtils.saveUploadFiles(uploadFile.getFiles(), UPLOAD_PATH);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseResult.errorReturn(HttpStatus.BAD_REQUEST.value(), "上传失败");
        }


        return ResponseResult.successReturn("上传成功!");
    }
}
