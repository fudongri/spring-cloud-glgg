package org.galigeigei.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fdr on 2017/8/26.
 */
@RestController
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    private AmqpTemplate amqpTemplate;

    @RequestMapping("/add")
    public void add() {
        logger.info("adding.......");
        amqpTemplate.convertAndSend("glgg-queue", "393556397@qq.com");
    }

}
