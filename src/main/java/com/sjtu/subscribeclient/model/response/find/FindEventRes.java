package com.sjtu.subscribeclient.model.response.find;

import com.sjtu.subscribeclient.model.object.ObjectRes;
import com.sjtu.subscribeclient.model.response.base.BaseRes;

import java.util.List;

public class FindEventRes extends BaseRes {
    private List<ObjectRes> objects;

    public FindEventRes(String status, List<ObjectRes> objects) {
        this.op = "FIND_EVENT";
        this.status = status;
        this.objects = objects;
    }

    public List<ObjectRes> getObjects() {
        return objects;
    }

    public void setObjects(List<ObjectRes> objects) {
        this.objects = objects;
    }

    @Override
    public String toString() {
        return "{\"op\":" + op + ",\"status\":" + status + ",\"objects\":" + objects.toString() + "}";
    }
}
