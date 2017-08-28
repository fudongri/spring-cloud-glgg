package org.galigeigei.amqp;

import org.galigeigei.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by fdr on 2017/8/26.
 */

@Configuration
@RabbitListener(queues = "glgg-queue")
public class RabbitMsgListener {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MailService mailService;

    @Bean
    public Queue glggQueue() {
        logger.debug("create glgg-queue..");
        return new Queue("glgg-queue");
    }

    @RabbitHandler
    public void onMsg(String to) {
        logger.info("mail to---->{}", to);
        //mailService.sendSimpleMailMessage(to, "明天一起吃饭", "一起去吃烤鱼");
    }
}
