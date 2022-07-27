package com.example.harmony.models;

public class Composer {

    private String name;
    private String id;
    private User user;

    public Composer() {
    }

    public Composer(String name) {
        this.name = name;
    }

    public Composer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Composer(String name, String id, User user) {
        this.name = name;
        this.id = id;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Composer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", user=" + user.toString() +
                '}';
    }
}
