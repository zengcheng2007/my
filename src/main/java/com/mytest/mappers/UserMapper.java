package com.mytest.mappers;

import com.mytest.entity.Sys_UserVO;

import java.util.List;

public interface UserMapper {
    int insert(Sys_UserVO u);

    int updateById(Sys_UserVO u);

    int deleteById(Long id);

    Sys_UserVO selectById(Long id);

    List<Sys_UserVO> selectAll();

}
