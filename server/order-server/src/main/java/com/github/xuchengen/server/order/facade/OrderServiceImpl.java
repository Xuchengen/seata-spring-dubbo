package com.github.xuchengen.server.order.facade;

import cn.hutool.core.util.RandomUtil;
import com.github.xuchengen.facade.order.OrderService;
import com.github.xuchengen.facade.account.AccountService;
import com.github.xuchengen.server.order.dao.mapper.OrderDOMapper;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * 订单服务实现
 * 作者：徐承恩
 * 邮箱：xuchengen@gmail.com
 * 日期：2019/12/19
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDOMapper orderDOMapper;

    @Reference(check = false)
    private AccountService accountService;

    @Override
    public void create(String userId, String commodityCode, int orderCount) {

        int orderMoney = RandomUtil.randomInt(1, 5) * orderCount;

        accountService.debit(userId, orderMoney);

        orderDOMapper.createOrder(userId, commodityCode, orderCount, orderMoney);
    }
}
