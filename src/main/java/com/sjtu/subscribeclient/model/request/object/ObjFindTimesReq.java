package com.sjtu.subscribeclient.model.request.object;

import com.sjtu.subscribeclient.model.request.base.BaseReq;

import java.util.Date;

public class ObjFindTimesReq extends BaseReq {
    private Date start;
    private Date end;

    public ObjFindTimesReq(String userId, String id, Date start, Date end) {
        this.op = "OBJECT_FIND_TIMES";
        this.userId = userId;
        this.id = id;
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
