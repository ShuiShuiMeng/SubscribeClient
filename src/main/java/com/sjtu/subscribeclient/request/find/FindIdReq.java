package com.sjtu.subscribeclient.request.find;

import com.sjtu.subscribeclient.request.base.BaseReq;

public class FindIdReq extends BaseReq {

    public FindIdReq(String userId, String id) {
        this.op = "FIND_ID";
        this.userId = userId;
        this.id = id;
    }

}
