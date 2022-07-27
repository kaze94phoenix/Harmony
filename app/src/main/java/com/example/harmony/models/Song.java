package com.example.harmony.models;

public class Song {

    private String title;
    private String chorus;
    private SongType songType;

    public Song(String title) {
        this.title = title;
    }

    public Song(String title, String chorus) {
        this.title = title;
        this.chorus = chorus;
    }

    public Song(String title, SongType songType) {
        this.title = title;
        this.songType = songType;
    }

    public Song(String title, String chorus, SongType songType) {
        this.title = title;
        this.chorus = chorus;
        this.songType = songType;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setChorus(String chorus) {
        this.chorus = chorus;
    }

    public void setTypeSong(SongType songType) {
        this.songType = songType;
    }

    public String getTitle() {
        return title;
    }

    public String getChorus() {
        return chorus;
    }

    public SongType getTypeSong() {
        return songType;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", chorus='" + chorus + '\'' +
                ", typeSong=" + songType.toString() +
                '}';
    }
}
