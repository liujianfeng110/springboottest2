package com.niufen.mapper;

import com.niufen.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}
