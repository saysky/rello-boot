package com.example.ssm.rental.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.ssm.rental.common.base.BaseEntity;

/**
 * 收藏记录
 *
 * @author example
 * @date 2022/3/13 12:14 下午
 */
@TableName("t_mark")
public class Mark extends BaseEntity {
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 房子ID
     */
    private Long houseId;

    /**
     * 房子信息
     */
    @TableField(exist = false)
    private House house;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
}
