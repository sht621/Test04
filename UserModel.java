package com.example.demo.model;

public class UserModel {
    private int Id;
    private int User_Id;
    private String Pass;

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }

    public int getUserId() {
        return User_Id;
    }
    public void setUserId(int User_Id) {
    	this.User_Id = User_Id;
    }

    public String getPass() {
        return Pass;
    }
    public void setPass(String Pass) {
        this.Pass = Pass;
    }
}
