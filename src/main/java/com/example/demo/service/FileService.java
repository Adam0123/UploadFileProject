package com.example.demo.service;

/**
 * @author zdz
 * @create 2018-06-07-14:37
 */

import com.example.demo.entity.MetaData;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;


public interface FileService {
    public List<MetaData> loadAllMetaData();

    public Optional<MetaData> loadMetaDataDetails(int id);

    public File getDownloadFile(Integer id);

    public String uploadFile(MultipartFile file);

    public String downloadFile(Integer id, HttpServletResponse response, HttpServletRequest request) throws IOException;
    public List<MetaData> recentMetaData();
    public Integer getIDByname(String fileName);
}