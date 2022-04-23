package com.example.ssm.rental.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.ssm.rental.common.base.BaseEntity;

/**
 * 账单
 */
@TableName("t_bill")
public class Bill extends BaseEntity {

    /**
     * 标题
     */
    private String title;

    /**
     * 状态：0待支付，1已支付
     */
    private Integer status;


    /**
     * 租客用户ID
     */
    private Long customerUserId;

    /**
     * 房东用户ID
     */
    private Long ownerUserId;


    /**
     * 房子ID
     */
    private Long houseId;

    /**
     * 总金额
     */
    private Integer totalAmount;

    /**
     * 订单id
     */
    private Long orderId;

    @TableField(exist = false)
    private User user;

    @TableField(exist = false)
    private House house;


    /**
     * 租客用户信息
     */
    @TableField(exist = false)
    private User customerUser;


    /**
     * 房东用户信息
     */
    @TableField(exist = false)
    private User ownerUser;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCustomerUserId() {
        return customerUserId;
    }

    public void setCustomerUserId(Long customerUserId) {
        this.customerUserId = customerUserId;
    }

    public Long getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public User getOwnerUser() {
        return ownerUser;
    }

    public void setOwnerUser(User ownerUser) {
        this.ownerUser = ownerUser;
    }

    public User getCustomerUser() {
        return customerUser;
    }

    public void setCustomerUser(User customerUser) {
        this.customerUser = customerUser;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
