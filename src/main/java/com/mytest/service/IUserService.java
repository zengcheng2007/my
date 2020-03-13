package com.mytest.service;

import com.mytest.entity.Sys_UserVO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUserService {
    void save(Sys_UserVO u);

    void update(Sys_UserVO u);

    void delete(Long id);

    Sys_UserVO get(Long id);

    List<Sys_UserVO> listAll();
}
