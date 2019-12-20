package com.github.xuchengen.facade.storage;

/**
 * 库存服务
 * 作者：徐承恩
 * 邮箱：xuchengen@gmail.com
 * 日期：2019/12/19
 */
public interface StorageService {

    /**
     * 扣除库存数量
     */
    void deduct(String commodityCode, int count);

}
