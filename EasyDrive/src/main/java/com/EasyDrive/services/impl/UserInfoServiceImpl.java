package com.EasyDrive.services.impl;

import com.EasyDrive.entities.po.UserInfo;
import com.EasyDrive.services.UserInfoService;

import org.springframework.stereotype.Service;

import java.util.List;


@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {


    @Override
    public Integer add(UserInfo bean) {
        return 0;
    }

    @Override
    public Integer addBatch(List<UserInfo> listBean) {
        return 0;
    }

    @Override
    public Integer addOrUpdateBatch(List<UserInfo> listBean) {
        return 0;
    }

    @Override
    public UserInfo getUserInfoByUserId(String userId) {
        return null;
    }

    @Override
    public Integer updateUserInfoByUserId(UserInfo bean, String userId) {
        return 0;
    }

    @Override
    public Integer deleteUserInfoByUserId(String userId) {
        return 0;
    }

    @Override
    public UserInfo getUserInfoByEmail(String email) {
        return null;
    }

    @Override
    public Integer updateUserInfoByEmail(UserInfo bean, String email) {
        return 0;
    }

    @Override
    public Integer deleteUserInfoByEmail(String email) {
        return 0;
    }

    @Override
    public UserInfo getUserInfoByNickName(String nickName) {
        return null;
    }

    @Override
    public Integer updateUserInfoByNickName(UserInfo bean, String nickName) {
        return 0;
    }

    @Override
    public Integer deleteUserInfoByNickName(String nickName) {
        return 0;
    }

    @Override
    public UserInfo getUserInfoByQqOpenId(String qqOpenId) {
        return null;
    }

    @Override
    public Integer updateUserInfoByQqOpenId(UserInfo bean, String qqOpenId) {
        return 0;
    }

    @Override
    public Integer deleteUserInfoByQqOpenId(String qqOpenId) {
        return 0;
    }

    @Override
    public void register(String email, String nickName, String password, String emailCode) {

    }

    @Override
    public void resetPwd(String email, String password, String emailCode) {

    }

    @Override
    public void updateUserStatus(String userId, Integer status) {

    }

    @Override
    public void changeUserSpace(String userId, Integer changeSpace) {

    }
}