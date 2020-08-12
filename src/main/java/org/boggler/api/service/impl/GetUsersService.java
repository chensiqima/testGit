package org.boggler.api.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.boggler.api.dto.UserDto;
import org.boggler.api.mappers.MasterMapper;
import org.boggler.api.service.GetAllUsers;
import org.boggler.api.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class GetUsersService implements GetAllUsers {

    @Autowired
    private org.boggler.api.mappers.MasterMapper masterMapper;
    @Autowired
    private org.boggler.api.util.RedisUtil RedisUtil;
    @Override
    public PageInfo<UserDto> GetAllUsers(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        System.out.println("1 = " + 1);
        log.info("结果=>"+masterMapper.getAllList());
        return new PageInfo<>(masterMapper.getAllList());
    }

    @Override
    public JSONObject GetRedis() {
        log.info("redis->"+RedisUtil.set("first",111));
        RedisUtil.set("first11",11122);
        JSONObject JSON=new JSONObject();
        JSON.put("first11",RedisUtil.get("first11"));
        return JSON;
    }

    public List<UserDto> getAllList() {
        return masterMapper.getAllList();
    }
}
