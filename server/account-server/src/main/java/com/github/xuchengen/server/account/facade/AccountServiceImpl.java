package com.github.xuchengen.server.account.facade;

import com.github.xuchengen.facade.account.AccountService;
import com.github.xuchengen.server.account.dao.mapper.AccountDOMapper;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * 账户服务实现
 * 作者：徐承恩
 * 邮箱：xuchengen@gmail.com
 * 日期：2019/12/19
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDOMapper accountDOMapper;

    @Override
    public void debit(String userId, int money) {
        accountDOMapper.decreaseAccount(userId, money);
    }
}
