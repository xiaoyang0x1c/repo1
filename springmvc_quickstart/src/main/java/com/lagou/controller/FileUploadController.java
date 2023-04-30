package com.lagou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author xiaoyang
 * @date 2023/4/16
 * @program springmvc
 */
@Controller
public class FileUploadController {
    @RequestMapping("/fileupload")
    public String fileupload(String username, MultipartFile filePic) throws IOException {
        System.out.println(username);
        System.out.println(filePic.getName());
        String filePicName = filePic.getOriginalFilename();
        filePic.transferTo(new File("D:/JavePractice/files/"+filePicName));
        return "success";
    }
    @RequestMapping("/fileuploads")
    public String fileuploads(String username,MultipartFile[] files) throws IOException {
        System.out.println(username);
        for (MultipartFile file:files){
            String originalFilename = file.getOriginalFilename();
            file.transferTo(new File("D:/JavePractice/files/"+originalFilename));
        }
        return "success";
    }
}
