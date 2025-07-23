package com.ohgiraffers.projecjNull.practoce02.level01.basic.member.model.dto;

public class MemberDTO {

    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;
    private String phone;
    private String email;

    public MemberDTO() {}


    public MemberDTO(String id, String pwd, String name, int age, char gender, String phone, String email) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;

    }
    public void setName(String name) {
        this.name = name;

    }
    public void setAge(int age) {
        this.age = age;

    }
    public void setGender(char gender) {
        this.gender = gender;

    }
    public void setPhone(String phone) {
        this.phone = phone;

    }
    public void setEmail(String email) {
        this.email = email;

    }
    public String getId() {
        return id;
    }
    public String getPwd() {
        return pwd = pwd;
    }
    public String getName() {
        return name = name;
    }
    public int getAge() {
        return age = age;
    }
    public char getGender() {
        return gender = gender;
    }
    public String getPhone() {
        return phone = phone;
    }
    public String getEmail() {
        return email = email;
    }


}
