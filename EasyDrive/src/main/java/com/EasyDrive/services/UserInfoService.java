package com.EasyDrive.services;

import com.EasyDrive.entities.po.UserInfo;

import java.util.List;


/**
 * User Information Service Interface
 */
public interface UserInfoService {

    // Add a new user
    Integer add(UserInfo bean);

    // Add multiple users in batch
    Integer addBatch(List<UserInfo> listBean);

    // Add or update multiple users in batch
    Integer addOrUpdateBatch(List<UserInfo> listBean);

    // Get user information by UserId
    UserInfo getUserInfoByUserId(String userId);

    // Update user information by UserId
    Integer updateUserInfoByUserId(UserInfo bean, String userId);

    // Delete user information by UserId
    Integer deleteUserInfoByUserId(String userId);

    // Get user information by Email
    UserInfo getUserInfoByEmail(String email);

    // Update user information by Email
    Integer updateUserInfoByEmail(UserInfo bean, String email);

    // Delete user information by Email
    Integer deleteUserInfoByEmail(String email);

    // Get user information by NickName
    UserInfo getUserInfoByNickName(String nickName);

    // Update user information by NickName
    Integer updateUserInfoByNickName(UserInfo bean, String nickName);

    // Delete user information by NickName
    Integer deleteUserInfoByNickName(String nickName);

    // Get user information by QQ OpenID
    UserInfo getUserInfoByQqOpenId(String qqOpenId);

    // Update user information by QQ OpenID
    Integer updateUserInfoByQqOpenId(UserInfo bean, String qqOpenId);

    // Delete user information by QQ OpenID
    Integer deleteUserInfoByQqOpenId(String qqOpenId);

    void register(String email, String nickName, String password, String emailCode);

    void resetPwd(String email, String password, String emailCode);

    void updateUserStatus(String userId, Integer status);

    void changeUserSpace(String userId, Integer changeSpace);
}
