package com.dkm.demo.entity;

import lombok.Data;

@Data
public class Question {
    private int id;

    private String tName;

    private int type;

    private String createAt;

    private int createUser;

    private int isDelete;

    private String answer;
}
