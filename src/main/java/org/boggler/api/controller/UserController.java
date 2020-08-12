package org.boggler.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import org.boggler.api.dto.MyResult;
import org.boggler.api.dto.UserDto;
import org.boggler.api.service.GetAllUsers;
import org.boggler.api.util.CompressUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private CompressUtil CompressUtil;
    @Autowired
    private GetAllUsers GetAllUsers;
    @PostMapping("/getphoto")
    public MyResult<JSONObject> GetPhoto(MultipartFile file) throws IOException {

        if (file.isEmpty()){
            return new MyResult<JSONObject>(-1,"fail",null);
        }
        String path="C:\\Users\\Administrator\\Desktop\\aaa1.JPG";
        file.transferTo(new File(path));
//        Thumbnails.of(path).size(3000,3000).toFiles(Rename.NO_CHANGE);
        CompressUtil.commpressPicForScale(path,path,200,0.8);
//        File newfile=new File(path);
//        newfile.delete();
        return new MyResult<>(0,"success",null);
    }

    @GetMapping("/getRedis")
    public  MyResult<JSONObject> GetRedisList(){
        try {
            return new MyResult<JSONObject>(0,"ok",GetAllUsers.GetRedis());
        } catch (Exception e) {
            e.printStackTrace();
            return new MyResult<JSONObject>(-1,"fail");
        }
    }
    @GetMapping("/getlist")
    public MyResult<PageInfo<UserDto>> GetAllList(Integer pageNum, Integer pageSize){
        MyResult<PageInfo<UserDto>> MyResult;
        try {
            return new MyResult<PageInfo<UserDto>>(0,"ok",GetAllUsers.GetAllUsers(pageNum,pageSize));
        } catch (Exception e) {
            e.printStackTrace();
            return new MyResult<PageInfo<UserDto>>(-1,"fail");
        }


    }




}
