package com.example.myftctest.ftcentity;

public class Users {
    private Integer likeid;

    private String ikename;

    public Integer getLikeid() {
        return likeid;
    }

    public void setLikeid(Integer likeid) {
        this.likeid = likeid;
    }

    public String getIkename() {
        return ikename;
    }

    public void setIkename(String ikename) {
        this.ikename = ikename == null ? null : ikename.trim();
    }
}