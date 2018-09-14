package com.example.academy_intern.team;

public class Member implements Person
{
    private String name;
    private String surname;
    private String email;
    private String password;
    private String occupation;

    public Member()
    {

    }

    public Member(String name, String surname, String email,String occupation, String password)
    {
        this.name = name;
        this.surname =surname;
        this.email = email;
        this.occupation = occupation;
        this.password = password;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

}
