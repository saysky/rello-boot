package com.example.ssm.rental.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.ssm.rental.common.base.BaseEntity;


/**
 * 用户信息
 *
 * @author example
 * @date 2022/3/13 12:08 下午
 */
@TableName("t_user")
public class User extends BaseEntity {

    /**
     * 登录名
     */
    private String userName;

    /**
     * 姓名称
     */
    private String userDisplayName;

    /**
     * 密码
     */
    private String userPass;

    /**
     * 身份证号码
     */
    private String idCard;

    /**
     * 头像
     */
    private String userAvatar;

    /**
     * 说明
     */
    private String userDesc;

    /**
     * 0 正常
     * 1 禁用
     */
    private Integer status = 0;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 职业
     */
    private String job;

    /**
     * 业余爱好
     */
    private String hobby;

    /**
     * 性别
     */
    private String sex;

    /**
     * 角色：管理员admin/房东owner/租客customer
     */
    private String role;

    /**
     * 身份证照片
     */
    private String idCardImg;

    /**
     * 未读消息
     */
    @TableField(exist = false)
    private Integer notReadMessageCount;

    /**
     * 未读消息
     */
    @TableField(exist = false)
    private String roleName;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDisplayName() {
        return userDisplayName;
    }

    public void setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getIdCardImg() {
        return idCardImg;
    }

    public void setIdCardImg(String idCardImg) {
        this.idCardImg = idCardImg;
    }

    public Integer getNotReadMessageCount() {
        return notReadMessageCount;
    }

    public void setNotReadMessageCount(Integer notReadMessageCount) {
        this.notReadMessageCount = notReadMessageCount;
    }


    public String getRoleName() {
        if( "admin".equals(role)) {
            return "平台管理员";
        }
        if( "owner".equals(role)) {
            return "房东";
        }
        if( "customer".equals(role)) {
            return "租客";
        }
        return role;
    }
}
