package com.example.harmony.models;

public class SongType {

    private String name;
    private String description;

    public SongType() {
    }

    public SongType(String name) {
        this.name = name;
    }

    public SongType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "TypeSong{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
