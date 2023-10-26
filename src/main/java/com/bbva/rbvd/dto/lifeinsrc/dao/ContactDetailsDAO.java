package com.bbva.rbvd.dto.lifeinsrc.dao;

import java.io.Serializable;

public class ContactDetailsDAO implements Serializable {
    private String userEmailPersonalDesc;
    private String phoneId;

    public String getUserEmailPersonalDesc() {
        return userEmailPersonalDesc;
    }

    public void setUserEmailPersonalDesc(String userEmailPersonalDesc) {
        this.userEmailPersonalDesc = userEmailPersonalDesc;
    }

    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "userEmailPersonalDesc='" + userEmailPersonalDesc + '\'' +
                ", phoneId='" + phoneId + '\'' +
                '}';
    }
}
