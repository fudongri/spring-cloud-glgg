package org.galigeigei.service;

/**
 * Created by fdr on 2017/8/26.
 */
public interface MailService {

    /**
     * 发送简单邮件
     * @param to 接收人
     * @param subject 主题
     * @param content 内容
     */
    void sendSimpleMailMessage(String to, String subject, String content);
}
