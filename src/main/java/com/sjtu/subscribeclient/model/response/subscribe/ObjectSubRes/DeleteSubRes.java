package com.sjtu.subscribeclient.model.response.subscribe.ObjectSubRes;

import com.sjtu.subscribeclient.model.response.subscribe.BaseSubRes;

public class DeleteSubRes extends BaseSubRes {
    private String id;

    public DeleteSubRes(String message, String id) {
        this.op = "SUB_RES_OBJ_DELETE";
        this.message = message;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
