package com.github.xuchengen.server.account.dao.mapper;


import com.github.xuchengen.server.account.dao.model.AccountDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface AccountDOMapper extends Mapper<AccountDO> {

    int decreaseAccount(@Param("userId") String userId, @Param("amount") Integer amount);

    int testGlobalLock(@Param("userId") String userId);

}