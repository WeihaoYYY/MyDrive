package com.EasyDrive.entities.query;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmailCodeQuery extends BaseParam {



    private String email;

    private String emailFuzzy;


    private String code;

    private String codeFuzzy;

    private String createTime;

    private String createTimeStart;

    private String createTimeEnd;

    private Integer status;


}
