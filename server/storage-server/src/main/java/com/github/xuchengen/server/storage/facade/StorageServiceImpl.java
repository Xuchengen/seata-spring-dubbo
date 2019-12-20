package com.github.xuchengen.server.storage.facade;

import com.github.xuchengen.facade.storage.StorageService;
import com.github.xuchengen.server.storage.dao.mapper.StorageDOMapper;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * 库存服务实现
 * 作者：徐承恩
 * 邮箱：xuchengen@gmail.com
 * 日期：2019/12/19
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDOMapper storageDOMapper;

    @Override
    public void deduct(String commodityCode, int count) {
        storageDOMapper.decreaseStorage(commodityCode, count);
    }
}
