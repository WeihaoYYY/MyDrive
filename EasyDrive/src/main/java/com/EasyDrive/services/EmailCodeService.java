package com.EasyDrive.services;

import com.EasyDrive.entities.po.EmailCode;
import com.EasyDrive.entities.query.EmailCodeQuery;
import com.EasyDrive.entities.vo.PaginationResultVO;

import java.util.List;

/**
 * Email verification code service interface
 */
public interface EmailCodeService {

    // Find list by parameters
    List<EmailCode> findListByParam(EmailCodeQuery param);

    // Find count by parameters
    Integer findCountByParam(EmailCodeQuery param);

    // Find list by page (pagination)
    PaginationResultVO<EmailCode> findListByPage(EmailCodeQuery param);

    // Add a new email code
    Integer add(EmailCode bean);

    // Add multiple email codes in batch
    Integer addBatch(List<EmailCode> listBean);

    // Add or update multiple email codes in batch
    Integer addOrUpdateBatch(List<EmailCode> listBean);

    // Get email code by Email and Code
    EmailCode getEmailCodeByEmailAndCode(String email, String code);

    // Update email code by Email and Code
    Integer updateEmailCodeByEmailAndCode(EmailCode bean, String email, String code);

    // Delete email code by Email and Code
    Integer deleteEmailCodeByEmailAndCode(String email, String code);

    // Send email code
    void sendEmailCode(String toEmail, Integer type);

    // Check email code
    void checkCode(String email, String code);
}
