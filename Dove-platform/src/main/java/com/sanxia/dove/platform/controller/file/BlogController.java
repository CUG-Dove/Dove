package com.sanxia.dove.platform.controller.file;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.io.File;

/**
 * Created by zy on 2018/3/7.
 */
@Controller
@RequestMapping("/Blog")
public class BlogController {
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/WritePage")
    public String WriteBlob(){
        return "file/WriteBlog";
    }

    @RequestMapping(value = "/doUploadBlog",method = RequestMethod.POST)
    public String UploadBlog(String html){
        logger.info(html);
        return "file/WriteBlog";
    }

    @RequestMapping(value = "/doUploadImg",method = RequestMethod.POST)
    public String UploadImg(String html){

        return "file/WriteBlog";
    }
}
