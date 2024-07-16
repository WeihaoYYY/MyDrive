package com.EasyDrive.controllers;

import com.EasyDrive.entities.constants.Constants;
import com.EasyDrive.entities.dto.CreateImageCode;
import com.EasyDrive.services.UserInfoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController("userInfoController")
@Tag(name = "User Information Controller", description = "Operations related to register, login, and user information")
public class AccountController extends ABaseController{

    @Resource
    private UserInfoService userInfoService;


    @Operation(summary = "Generate verification code", description = "Generate verification code for user login")
    @GetMapping(value = "/checkCode")
    public void checkCode(HttpServletResponse response, HttpSession session, Integer type) throws
            IOException {
        CreateImageCode vCode = new CreateImageCode(130, 38, 5, 10);
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        String code = vCode.getCode();
        if (type == null || type == 0) {
            session.setAttribute(Constants.CHECK_CODE_KEY, code);
        } else {
            session.setAttribute(Constants.CHECK_CODE_KEY_EMAIL, code);
        }
        vCode.write(response.getOutputStream());
    }

    @GetMapping(value = "/login")
    public void login() {
        System.out.println( "login");
    }





}
