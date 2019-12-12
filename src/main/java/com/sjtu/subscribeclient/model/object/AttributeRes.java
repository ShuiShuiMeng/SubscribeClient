package com.sjtu.subscribeclient.model.object;

import java.util.Date;

public class AttributeRes {
    private String value;
    private Date updateTime;

    public AttributeRes(String value, Date updateTime) {
        this.value = value;
        this.updateTime = updateTime;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
