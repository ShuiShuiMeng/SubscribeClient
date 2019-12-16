package com.sjtu.subscribeclient.model.notice;

import java.util.Date;

public class ObjectUpdateNotice extends BaseNotice {
    private String id;
    private String name;
    private String value;
    private Date updateTime;

    public ObjectUpdateNotice(String message, String id, String name, String value, Date updateTime) {
        this.op = "OBJECT_UPDATE_NOTICE";
        this.message = message;
        this.id = id;
        this.name = name;
        this.value = value;
        this.updateTime = updateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
