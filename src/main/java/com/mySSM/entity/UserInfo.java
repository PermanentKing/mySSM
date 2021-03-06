package com.mySSM.entity;


import com.mySSM.util.UUIDUtil;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 *  用户信息
 * @author wangjing 2019-06-06
 */
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * uuid
     */
    private String uuid;

    /**
     * username
     */
    private String username;

    /**
     * password
     */
    private String password;

    /**
     * nickname
     */
    private String nickname;

    /**
     * sex
     */
    private Integer sex;

    /**
     * phone
     */
    private String phone;

    /**
     * email
     */
    private String email;

    /**
     * iconpath
     */
    private String iconpath;


    public UserInfo() {
        //uuid = UUID.randomUUID().toString();
        this.uuid = UUIDUtil.getUUID();
        this.username = this.uuid;
        this.nickname = this.uuid;
        this.sex = 0;
    }

    public UserInfo(String username, String password, String nickname, Integer sex, String phone, String email, String iconpath){
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
        this.iconpath = iconpath;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIconpath() {
        return iconpath;
    }

    public void setIconpath(String iconpath) {
        this.iconpath = iconpath;
    }

    @Override
    public String toString(){
        String str = "UserInfo{" +
                "\'id\':\'" + getId() + "\'," +
                "\'uuid\':\'" + getUuid() + "\'," +
                "\'username\':\'" + getUsername() + "\'," +
                "\'password\':\'" + getPassword() + "\'," +
                "\'nickname\':\'" + getNickname() + "\'," +
                "\'sex\':\'" + getSex() + "\'," +
                "\'phone\':\'" + getPhone() + "\'," +
                "\'email\':\'" + getEmail() + "\'," +
                "\'iconpath\':\'" + getIconpath() + "\'" +
                "}";

        return str;
    }

}