package com.zorin.by.littlebakery.littlebakery.service;

import com.zorin.by.littlebakery.littlebakery.model.Image;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {
    Image storeFile(MultipartFile file);
    Resource loadFileAsResource(String fileName);
}
