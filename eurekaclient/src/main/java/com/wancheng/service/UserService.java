package com.wancheng.service;

import com.wancheng.entity.UserEntity;

import java.util.Collection;

public interface UserService {
    Collection<UserEntity> findAll();
    UserEntity findById(Long id);
}
