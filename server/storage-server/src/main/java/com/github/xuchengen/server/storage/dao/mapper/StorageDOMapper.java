package com.github.xuchengen.server.storage.dao.mapper;

import com.github.xuchengen.server.storage.dao.model.StorageDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface StorageDOMapper extends Mapper<StorageDO> {

    /**
     * 扣减商品库存
     */
    int decreaseStorage(@Param("commodityCode") String commodityCode, @Param("count") Integer count);

}