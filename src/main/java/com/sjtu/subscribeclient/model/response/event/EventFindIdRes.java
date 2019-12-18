package com.sjtu.subscribeclient.model.response.event;

import com.sjtu.subscribeclient.model.object.EventRes;
import com.sjtu.subscribeclient.model.response.base.BaseRes;

public class EventFindIdRes extends BaseRes {

    private EventRes event;
    private String id;

    public EventFindIdRes(String status, String message, String id, EventRes event) {
        this.op = "EVENT_FIND_ID";
        this.status = status;
        this.message = message;
        this.id = id;
        this.event = event;
    }

    public EventRes getEvent() {
        return event;
    }

    public void setEvent(EventRes event) {
        this.event = event;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{\"op\":" + op + ",\"status\":" + status + ",\"event\":" + event.toString() + "}";
    }
}
