package com.EasyDrive.entities.po;

import com.EasyDrive.entities.enums.DateTimePatternEnum;
import com.EasyDrive.utils.DateUtil;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@Schema(name = "EmailCode", description = "Email verification code")
public class EmailCode implements Serializable {

    // Email
    private String email;

    // Code
    private String code;

    // Creation time
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    // 0: Not used  1: Used
    private Integer status;

    @Override
    public String toString() {
        return "Email: " + (email == null ? "Empty" : email) + ", Code: " + (code == null ? "Empty" : code) + ", Creation time: " + (createTime == null ? "Empty" : DateUtil.format(createTime,
                DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + ", Status (0: Not used  1: Used): " + (status == null ? "Empty" : status);
    }
}
