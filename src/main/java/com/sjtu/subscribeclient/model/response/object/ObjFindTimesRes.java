package com.sjtu.subscribeclient.model.response.object;

import com.sjtu.subscribeclient.model.object.ObjectRes;
import com.sjtu.subscribeclient.model.response.base.BaseRes;

import java.util.Date;
import java.util.List;

public class ObjFindTimesRes extends BaseRes {

    private String id;
    private Date start;
    private Date end;
    private List<ObjectRes> objects;

    public ObjFindTimesRes(String status, String message, String id, Date start, Date end, List<ObjectRes> objects) {
        this.op = "OBJECT_FIND_TIMES";
        this.status = status;
        this.message = message;
        this.id = id;
        this.start = start;
        this.end = end;
        this.objects = objects;
    }

    public List<ObjectRes> getObjects() {
        return objects;
    }

    public void setObjects(List<ObjectRes> objects) {
        this.objects = objects;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "{\"op\":" + op + ",\"status\":" + status + ",\"id\":" + id + ",\"start\":" + start + ",\"end\":"+ end + ",\"objects\":" + objects.toString() + "}";
    }
}
