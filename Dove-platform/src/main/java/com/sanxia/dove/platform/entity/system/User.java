/**
 * Project Name:dove
 * File Name:User.java
 * Package Name:com.sanxia.dove.platform.entity.system
 * Date:2018-3-2 9:43
 *
 */

package com.sanxia.dove.platform.entity.system;

import java.io.File;
import java.io.Serializable;

/**
 *  Description:<br/>
 *  Date: 2018年3月2日 上午 9:55
 *  @author ly
 *  @version 1.1
 *  @see
 */

public class User implements Serializable{
    private Long id;
    private String username;
    private String password;
    private String isAdmin;
    private Long roleId;
    private Byte[] profilePicture;
    private String fullName;
    private String phone;
    private String email;
    private String address;
    private String remark;
    private String createTm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Byte[] getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(Byte[] profilePicture) {
        this.profilePicture = profilePicture;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateTm() {
        return createTm;
    }

    public void setCreateTm(String createTm) {
        this.createTm = createTm;
    }
}
