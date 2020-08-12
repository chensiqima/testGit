package org.boggler.api.service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import org.boggler.api.dto.UserDto;


public interface GetAllUsers {

    PageInfo<UserDto> GetAllUsers(Integer pageNum, Integer pageSize);
    JSONObject GetRedis();
}
