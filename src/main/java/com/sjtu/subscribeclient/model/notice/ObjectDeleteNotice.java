package com.sjtu.subscribeclient.model.notice;

public class ObjectDeleteNotice extends BaseNotice {
    private String id;

    public ObjectDeleteNotice(String message, String id) {
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
