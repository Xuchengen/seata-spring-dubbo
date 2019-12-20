package com.github.xuchengen.server.order.dao.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "`order_tbl`")
public class OrderDO {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "`user_id`")
    private String userId;

    @Column(name = "`commodity_code`")
    private String commodityCode;

    @Column(name = "`count`")
    private Integer count;

    @Column(name = "`money`")
    private Integer money;

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
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
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

    /**
     * @return money
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * @param money
     */
    public void setMoney(Integer money) {
        this.money = money;
    }
}