package com.androidtutorialshub.loginregister.model;

/**
 * Created by Emily on 7/17/17.
 */

public class UserWeight {
    // how to set this as foreign key of user table id???
    private int id;
    private int userBench;
    private int userSquat;
    private int userDeadlift;
    private int userOverheadpress;

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public Integer getBench() {
        return userBench;
    }

    public void setBench(int bench) {

        this.userBench = bench;
    }

    public Integer getSquat() {
        return userSquat;
    }

    public void setSquat(int squat) {

        this.userSquat = squat;
    }

    public Integer getDeadlift() {
        return userDeadlift;
    }

    public void setDeadlift(int deadlift) {

        this.userDeadlift = deadlift;
    }

    public Integer getOverheadpress() {
        return userOverheadpress;
    }

    public void setgetOverheadpress(int overheadpress) {

        this.userOverheadpress = overheadpress;
    }



}