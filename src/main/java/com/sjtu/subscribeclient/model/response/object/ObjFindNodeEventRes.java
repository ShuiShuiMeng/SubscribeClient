package com.sjtu.subscribeclient.model.response.object;

import com.sjtu.subscribeclient.model.object.ObjectRes;
import com.sjtu.subscribeclient.model.response.base.BaseRes;

import java.util.List;

public class ObjFindNodeEventRes extends BaseRes {

    private String nodeId;
    private String eventId;
    private List<ObjectRes> objects;

    public ObjFindNodeEventRes(String status, String message, String nodeId, String eventId, List<ObjectRes> objects) {
        this.op = "OBJECT_FIND_NODE_EVENT";
        this.status = status;
        this.message = message;
        this.nodeId = nodeId;
        this.eventId = eventId;
        this.objects = objects;
    }

    public List<ObjectRes> getObjects() {
        return objects;
    }

    public void setObjects(List<ObjectRes> objects) {
        this.objects = objects;
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

    @Override
    public String toString() {
        return "{\"op\":" + op +
                ",\"status\":" + status +
                ",\"nodeId\":" + nodeId +
                ",\"eventId\":" + eventId +
                ",\"objects\":" + objects.toString() + "}";
    }
}
