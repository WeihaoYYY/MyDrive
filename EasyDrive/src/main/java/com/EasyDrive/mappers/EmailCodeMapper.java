package com.EasyDrive.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * Email verification code database operation interface
 */
public interface EmailCodeMapper<T, P> extends BaseMapper<T, P> {

    // Update by Email and Code
    Integer updateByEmailAndCode(@Param("bean") T t, @Param("email") String email, @Param("code") String code);

    // Delete by Email and Code
    Integer deleteByEmailAndCode(@Param("email") String email, @Param("code") String code);

    // Select by Email and Code
    T selectByEmailAndCode(@Param("email") String email, @Param("code") String code);

    // Disable Email Code
    void disableEmailCode(@Param("email") String email);
}
