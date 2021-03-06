package com.wheny.whenynetlibrary.entity;

public class UserInfo {
    private int roleId;
    private int directLeaderId;
    private String directLeaderName;
    private String phone;
    private boolean enable;
    private String roleName;
    private String email;
    private int id;
    private int functionaryId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFunctionaryId() {
        return functionaryId;
    }

    public void setFunctionaryId(int functionaryId) {
        this.functionaryId = functionaryId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getDirectLeaderId() {
        return directLeaderId;
    }

    public void setDirectLeaderId(int directLeaderId) {
        this.directLeaderId = directLeaderId;
    }

    public String getDirectLeaderName() {
        return directLeaderName;
    }

    public void setDirectLeaderName(String directLeaderName) {
        this.directLeaderName = directLeaderName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "roleId=" + roleId +
                ", directLeaderId=" + directLeaderId +
                ", directLeaderName='" + directLeaderName + '\'' +
                ", phone='" + phone + '\'' +
                ", enable=" + enable +
                ", roleName='" + roleName + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", functionaryId=" + functionaryId +
                '}';
    }
}