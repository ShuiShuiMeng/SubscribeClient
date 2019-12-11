package com.sjtu.subscribeclient.request.find;

import com.sjtu.subscribeclient.request.base.BaseReq;

import java.util.Date;

public class FindTimeReq extends BaseReq {
    private Date date;

    public FindTimeReq(String userId, String id, Date date) {
        this.op = "FIND_TIME";
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
