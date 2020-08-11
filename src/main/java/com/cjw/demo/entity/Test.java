package com.cjw.demo.entity;

import java.beans.Transient;
import java.io.Serializable;

public class Test implements Serializable {


    private String id;
    private int age;

    private transient int score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
