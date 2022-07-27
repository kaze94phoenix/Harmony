package com.example.harmony.models;

public class UserType {

    private String name;
    private String description;

    public UserType() {
    }

    public UserType(String name) {
        this.name = name;
    }

    public UserType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "UserType{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
