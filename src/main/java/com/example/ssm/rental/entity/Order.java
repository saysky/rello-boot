package com.example.ssm.rental.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.ssm.rental.common.base.BaseEntity;

import java.util.Date;
import java.util.List;

/**
 * 订单信息
 *
 * @author example
 * @date 2022/3/13 12:29 下午
 */
@TableName("t_order")
public class Order extends BaseEntity {

    /**
     * 订单状态：-2待签合同，-1待付款，0生效中，1已到期，-3已取消，2申请退租，3申请退租不通过
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
     * 月租金
     */
    private Integer monthRent;



    /**
     * 日停车费
     */
    private Integer dayParkingFee;


    /**
     * 日物业费
     */
    private Integer dayManagingFee;

    /**
     * 水费
     */
    private Integer waterFee;

    /**
     * 电费
     */
    private Integer electricityFee;

    /**
     * 租住天数
     */
    private Integer dayNum;

    /**
     * 总金额
     */
    private Integer totalAmount;

    /**
     * 开始日期
     */
    private Date startDate;

    /**
     * 结束日期
     */
    private Date endDate;

    /**
     * 房子信息
     */
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



    @TableField(exist = false)
    private List<Integer> statusList;

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

    public Integer getMonthRent() {
        return monthRent;
    }

    public void setMonthRent(Integer monthRent) {
        this.monthRent = monthRent;
    }

    public Integer getDayNum() {
        return dayNum;
    }

    public void setDayNum(Integer dayNum) {
        this.dayNum = dayNum;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public User getCustomerUser() {
        return customerUser;
    }

    public void setCustomerUser(User customerUser) {
        this.customerUser = customerUser;
    }

    public User getOwnerUser() {
        return ownerUser;
    }

    public void setOwnerUser(User ownerUser) {
        this.ownerUser = ownerUser;
    }

    public Integer getDayParkingFee() {
        return dayParkingFee;
    }

    public void setDayParkingFee(Integer dayParkingFee) {
        this.dayParkingFee = dayParkingFee;
    }

    public Integer getDayManagingFee() {
        return dayManagingFee;
    }

    public void setDayManagingFee(Integer dayManagingFee) {
        this.dayManagingFee = dayManagingFee;
    }

    public Integer getWaterFee() {
        return waterFee;
    }

    public void setWaterFee(Integer waterFee) {
        this.waterFee = waterFee;
    }

    public Integer getElectricityFee() {
        return electricityFee;
    }

    public void setElectricityFee(Integer electricityFee) {
        this.electricityFee = electricityFee;
    }

    public List<Integer> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<Integer> statusList) {
        this.statusList = statusList;
    }
}
