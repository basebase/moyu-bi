package com.moyu.bi.common.upload;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Joker on 18/1/10.
 */
public class FileUploadUtils {

    public static void saveUploadFiles(MultipartFile[] multipartFiles, final String UPLOAD_PATH) throws IOException {
        for (MultipartFile multipartFile : multipartFiles) {
            if (multipartFile.isEmpty()) {
                continue;
            }

            byte[] bytes = multipartFile.getBytes();
            Path path = Paths.get(UPLOAD_PATH + multipartFile.getOriginalFilename());
            Files.write(path, bytes);
        }
    }
}
