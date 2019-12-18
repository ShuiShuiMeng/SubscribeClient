package com.sjtu.subscribeclient.model.request.object;

import com.sjtu.subscribeclient.model.request.base.BaseReq;

import java.util.Date;

public class ObjFindTimeReq extends BaseReq {
    private Date date;

    public ObjFindTimeReq(String userId, String id, Date date) {
        this.op = "OBJECT_FIND_TIME";
        this.userId = userId;
        this.id = id;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
