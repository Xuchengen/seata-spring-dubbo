package com.github.xuchengen.server.app.web;

import cn.hutool.core.util.RandomUtil;
import com.github.xuchengen.server.app.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 作者：徐承恩
 * 邮箱：xuchengen@gmail.com
 * 日期：2019/12/19
 */
@RestController
public class IndexCtl {

    @Resource
    private TransactionService transactionService;

    @GetMapping(value = {"", "/"})
    public Object index() {

        String userId = "0001";

        String commodityCode = "bnaner";

        int orderCount = RandomUtil.randomInt(1, 10);

        transactionService.purchase(userId, commodityCode, orderCount);

        return "OK";
    }

}
