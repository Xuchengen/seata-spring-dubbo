package com.github.xuchengen.server.app.service;

/**
 * 交易服务
 * 作者：徐承恩
 * 邮箱：xuchengen@gmail.com
 * 日期：2019/12/19
 */
public interface TransactionService {

    void purchase(String userId, String commodityCode, int orderCount);

}
