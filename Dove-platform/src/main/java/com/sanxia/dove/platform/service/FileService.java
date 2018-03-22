package com.sanxia.dove.platform.service;


import com.sanxia.dove.platform.dto.FileStorer;

/**
 * Created by zy on 2018/3/2.
 */

public interface FileService {
    public FileStorer getFloderDir(String path, String URL);
    public String getFloderDir2(String path, String URL);
    public FileStorer showFile(String path);
    public String fileType(String fileName);
}
