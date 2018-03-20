package com.sanxia.dove.platform.controller.file;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Created by zy on 2018/3/7.
 */
@Controller
@RequestMapping(value = "/Blog")
public class BlogController {
    @Autowired
    HttpServletRequest request;
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/WritePage")
    public String WriteBlob(){
        return "file/WriteBlog";
    }


    @RequestMapping(value = "/doUploadBlog",method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String UploadBlog(String html){
        logger.info(html);
        return html;
    }

    @RequestMapping(value = "/doUploadImg",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String UploadImg(@RequestParam(value = "editormd-image-file", required = true) MultipartFile file){
        String trueFileName = file.getOriginalFilename();

        String suffix = trueFileName.substring(trueFileName.lastIndexOf("."));

        String fileName = System.currentTimeMillis()+"_"+suffix;

        //String path = request.getSession().getServletContext().getRealPath("/assets/msg/upload/");
        String path="e:/Dove/test/Floder";
        System.out.println(path);

        File targetFile = new File(path, fileName);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }

        //保存
        try {
            file.transferTo(targetFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String json = "{'success':  1,'message' : 'upload success','url':'"+path+"'}";

        return json;
    }
}
