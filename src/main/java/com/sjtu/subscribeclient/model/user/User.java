package com.sjtu.subscribeclient.model.user;

public class User {
    private String id;
    private String name;
    private String intro;

    public User(String id, String name, String intro) {
        this.id = id;
        this.name = name;
        this.intro = intro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
