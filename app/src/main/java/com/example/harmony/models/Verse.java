package com.example.harmony.models;

public class Verse {

    private Song song;
    private int number;
    private String text;


    public Verse(Song song, int number, String text) {
        this.song = song;
        this.number = number;
        this.text = text;
    }

    public Verse() {
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Verse{" +
                "song=" + song.toString() +
                ", number=" + number +
                ", text='" + text + '\'' +
                '}';
    }
}
