package com.github.xuchengen.server.app.service.impl;

import cn.hutool.core.util.RandomUtil;
import com.github.xuchengen.facade.order.OrderService;
import com.github.xuchengen.facade.storage.StorageService;
import com.github.xuchengen.server.app.service.TransactionService;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * 交易服务实现
 * 作者：徐承恩
 * 邮箱：xuchengen@gmail.com
 * 日期：2019/12/19
 */
@Service
public class TransactionServiceImpl implements TransactionService {

    @Reference(check = false)
    private OrderService orderService;

    @Reference(check = false)
    private StorageService storageService;

    @Override
    @GlobalTransactional
    public void purchase(String userId, String commodityCode, int orderCount) {
        storageService.deduct(commodityCode, orderCount);
        orderService.create(userId, commodityCode, orderCount);
        int i = RandomUtil.randomInt(1, 10);
        if (i % 2 == 0) {
            throw new RuntimeException("模拟异常");
        }
    }
}
