package com.sjtu.subscribeclient.model.notice;

import com.sjtu.subscribeclient.model.object.EventRes;

public class EventCreateNotice extends BaseNotice {
    private EventRes event;

    public EventCreateNotice(String message, EventRes event, String subType) {
        this.op = "EVENT_CREATE_NOTICE";
        this.message = message;
        this.event = event;
        this.subType = subType;
    }

    public EventRes getEvent() {
        return event;
    }

    public void setEvent(EventRes event) {
        this.event = event;
    }
}
