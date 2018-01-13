package com.moyu.bi.domain.upload;


import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Joker on 18/1/9.
 * 文件上传模型
 */
public class UploadFile {
    private MultipartFile[] files;

    public MultipartFile[] getFiles() {
        return files;
    }

    public void setFiles(MultipartFile[] files) {
        this.files = files;
    }
}
