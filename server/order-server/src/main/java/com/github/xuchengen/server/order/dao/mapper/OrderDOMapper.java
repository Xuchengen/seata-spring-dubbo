package com.github.xuchengen.server.order.dao.mapper;

import com.github.xuchengen.server.order.dao.model.OrderDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface OrderDOMapper extends Mapper<OrderDO> {

    /**
     * 创建订单
     */
    void createOrder(@Param("userId") String userId, @Param("commodityCode") String commodityCode, @Param("count") Integer count, @Param("amount") Integer amount);

}