package com.sjtu.subscribeclient.model.request.register;

public class RegisterReq {
    private String op;
    private String name;
    private String intro;

    public RegisterReq(String name, String intro) {
        this.op = "REGISTER";
        this.name = name;
        this.intro = intro;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
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
