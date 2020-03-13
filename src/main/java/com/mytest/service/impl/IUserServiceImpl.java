package com.mytest.service.impl;

import com.mytest.mappers.UserMapper;
import com.mytest.entity.Sys_UserVO;
import com.mytest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    //声明式事物
    @Transactional
    @Override
    public void save(Sys_UserVO u) {
        userMapper.insert(u);
    }

    @Override
    public void update(Sys_UserVO u) {
        userMapper.updateById(u);
    }

    @Override
    public void delete(Long id) {
        userMapper.deleteById(id);
    }

    @Override
    public Sys_UserVO get(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<Sys_UserVO> listAll() {
        List<Sys_UserVO> users=userMapper.selectAll();
        return users;
    }


}
