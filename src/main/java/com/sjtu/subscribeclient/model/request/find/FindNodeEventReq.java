package com.sjtu.subscribeclient.model.request.find;

import com.sjtu.subscribeclient.model.request.base.BaseReq;

public class FindNodeEventReq extends BaseReq {
    private String nodeId;
    private String eventId;

    public FindNodeEventReq(String userId, String nodeId, String eventId) {
        this.op = "FIND_NODE_EVENT";
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
