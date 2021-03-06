package com.mySSM.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @auther wangjing
 * @date 2019/6/13
 */
public class RolePermission implements Serializable {

    private Long id; //编号
    private Long roleId; //角色ID
    private Long permissionId; //权限ID

    private List<Role> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "RolePermission{" +
                "roleId=" + roleId +
                ", permissionId=" + permissionId +
                '}';
    }
}
