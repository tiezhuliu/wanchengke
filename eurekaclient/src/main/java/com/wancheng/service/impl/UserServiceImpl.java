package com.wancheng.service.impl;

import com.wancheng.entity.UserEntity;
import com.wancheng.service.UserService;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserServiceImpl implements UserService {

    private static Map<Long,UserEntity> userEntityMap;

    static {
        userEntityMap = new HashMap<>();
        userEntityMap.put(1L,new UserEntity(1L,"张三",18));
        userEntityMap.put(2L,new UserEntity(2L,"李四",28));
        userEntityMap.put(3L,new UserEntity(3L,"王五",38));
    }


    @Override
    public Collection<UserEntity> findAll() {
        return userEntityMap.values();
    }

    @Override
    public UserEntity findById(Long id) {
        return userEntityMap.get(id);
    }
}
