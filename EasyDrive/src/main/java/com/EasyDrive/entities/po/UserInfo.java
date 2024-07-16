package com.EasyDrive.entities.po;

import com.EasyDrive.entities.enums.DateTimePatternEnum;
import com.EasyDrive.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;


import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * User Information
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "User Account Information")
public class UserInfo implements Serializable {

    // User ID
    @Schema(description = "User unique ID")
    private String userId;

    // Nickname
    private String nickName;

    // Email
    private String email;

    // QQ Avatar
    @Schema(description = "QQ Avatar URL", example = "https://q1.qlogo.cn/g?b=qq&nk=QQ1122234131&s=100")
    private String qqAvatar;

    // QQ OpenID
    private String qqOpenId;

    // Password
    private String password;

    // Join Time
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date joinTime;

    // Last Login Time
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastLoginTime;

    // Status (0: Ban, 1: Active)
    @Schema(description = "Status (0: Disabled, 1: Active)")
    private Integer status;

    // Used Space in bytes
    @Schema(description = "Used space in bytes")
    private Long useSpace;

    // Total Space in bytes
    @Schema(description = "Total space in bytes")
    private Long totalSpace;

    @Override
    public String toString() {
        return "User ID: " + (userId == null ? "Empty" : userId) +
                ", Nickname: " + (nickName == null ? "Empty" : nickName) +
                ", Email: " + (email == null ? "Empty" : email) +
                ", QQ Avatar: " + (qqAvatar == null ? "Empty" : qqAvatar) +
                ", QQ OpenID: " + (qqOpenId == null ? "Empty" : qqOpenId) +
                ", Password: " + (password == null ? "Empty" : password) +
                ", Join Time: " + (joinTime == null ? "Empty" : DateUtil.format(joinTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) +
                ", Last Login Time: " + (lastLoginTime == null ? "Empty" : DateUtil.format(lastLoginTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) +
                ", Status (0: Disabled, 1: Active): " + (status == null ? "Empty" : status) +
                ", Used Space: " + (useSpace == null ? "Empty" : useSpace) +
                ", Total Space: " + (totalSpace == null ? "Empty" : totalSpace);
    }
}
