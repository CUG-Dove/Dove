package com.sanxia.dove.platform.controller.file;

import com.sanxia.dove.platform.core.utils.PropertiesUtils;
import com.sanxia.dove.platform.dto.ImgJson;
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
    public ImgJson UploadImg(@RequestParam(value = "editormd-image-file", required = true) MultipartFile file){
        String username = "user1";
        String trueFileName = file.getOriginalFilename();
        String suffix = trueFileName.substring(trueFileName.lastIndexOf("."));
        String fileName = System.currentTimeMillis()+"_"+suffix;

        String upload_path=PropertiesUtils.getProperty("FILE_DISK_PATH")+username+"/img";

        File targetFile = new File(upload_path, fileName);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        String download_path = PropertiesUtils.getProperty("FILE_RELATIVELY_PATH")+username+"/img/"+fileName;
        //保存
        try {
            file.transferTo(targetFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ImgJson json = new ImgJson(1,"upload success",download_path);

        return json;
    }
}