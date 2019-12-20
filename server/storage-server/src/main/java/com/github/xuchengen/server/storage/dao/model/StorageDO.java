package com.github.xuchengen.server.storage.dao.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "`storage_tbl`")
public class StorageDO {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "`commodity_code`")
    private String commodityCode;

    @Column(name = "`count`")
    private Integer count;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return commodity_code
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * @param commodityCode
     */
    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode == null ? null : commodityCode.trim();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }
}