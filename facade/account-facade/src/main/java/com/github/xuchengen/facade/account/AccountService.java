package com.github.xuchengen.facade.account;

/**
 * 帐户服务
 * 作者：徐承恩
 * 邮箱：xuchengen@gmail.com
 * 日期：2019/12/19
 */
public interface AccountService {

    /**
     * 从用户账户中借出
     */
    void debit(String userId, int money);

}
