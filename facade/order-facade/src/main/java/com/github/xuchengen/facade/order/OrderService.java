package com.github.xuchengen.facade.order;

/**
 * 订单服务
 * 作者：徐承恩
 * 邮箱：xuchengen@gmail.com
 * 日期：2019/12/19
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(String userId, String commodityCode, int orderCount);

}
