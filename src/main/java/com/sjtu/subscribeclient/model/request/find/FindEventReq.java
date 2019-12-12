package com.sjtu.subscribeclient.model.request.find;

import com.sjtu.subscribeclient.model.request.base.BaseReq;

public class FindEventReq extends BaseReq {
    private String nodeId;
    private String eventId;

    public FindEventReq(String userId, String nodeId, String eventId) {
        this.op = "FIND_ID";
        this.userId = userId;
        this.nodeId = nodeId;
        this.eventId = eventId;
    }
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
}
