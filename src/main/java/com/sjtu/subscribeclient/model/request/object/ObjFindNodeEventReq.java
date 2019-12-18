package com.sjtu.subscribeclient.model.request.object;

import com.sjtu.subscribeclient.model.request.base.BaseReq;

public class ObjFindNodeEventReq extends BaseReq {
    private String nodeId;
    private String eventId;

    public ObjFindNodeEventReq(String userId, String nodeId, String eventId) {
        this.op = "OBJECT_FIND_NODE_EVENT";
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
