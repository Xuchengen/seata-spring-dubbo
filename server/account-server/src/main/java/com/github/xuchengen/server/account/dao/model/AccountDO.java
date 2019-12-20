package com.github.xuchengen.server.account.dao.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "`account_tbl`")
public class AccountDO {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "`user_id`")
    private String userId;

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