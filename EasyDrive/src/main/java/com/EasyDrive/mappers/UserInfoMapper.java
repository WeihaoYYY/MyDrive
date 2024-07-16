package com.EasyDrive.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * User Information Database Operation Interface
 */
public interface UserInfoMapper<T, P> extends BaseMapper<T, P> {

    // Update by UserId
    Integer updateByUserId(@Param("bean") T t, @Param("userId") String userId);

    // Delete by UserId
    Integer deleteByUserId(@Param("userId") String userId);

    // Get object by UserId
    T selectByUserId(@Param("userId") String userId);

    // Update by Email
    Integer updateByEmail(@Param("bean") T t, @Param("email") String email);

    // Delete by Email
    Integer deleteByEmail(@Param("email") String email);

    // Get object by Email
    T selectByEmail(@Param("email") String email);

    // Update by NickName
    Integer updateByNickName(@Param("bean") T t, @Param("nickName") String nickName);

    // Delete by NickName
    Integer deleteByNickName(@Param("nickName") String nickName);

    // Get object by NickName
    T selectByNickName(@Param("nickName") String nickName);

    // Update by QQ OpenID
    Integer updateByQqOpenId(@Param("bean") T t, @Param("qqOpenId") String qqOpenId);

    // Delete by QQ OpenID
    Integer deleteByQqOpenId(@Param("qqOpenId") String qqOpenId);

    // Get object by QQ OpenID
    T selectByQqOpenId(@Param("qqOpenId") String qqOpenId);

    Integer updateUserSpace(@Param("userId") String userId, @Param("useSpace") Long useSpace, @Param("totalSpace") Long totalSpace);
}
