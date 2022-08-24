package com.andrew.notification.rabbitmq;

public class Employee {
    private String name;
    private String email;
    private int experience;

    public Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}

class Developer extends Employee{

    public Developer(String name, String email, int experience) {
        super(name, email, experience);
    }
}

class DataAnalyst extends Employee{

    public DataAnalyst(String name, String email, int experience) {
        super(name, email, experience);
    }
}
