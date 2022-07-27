package com.example.harmony.models;

public class SongComposer {

    private Song song;
    private Composer composer;

    public SongComposer() {
    }

    public SongComposer(Song song, Composer composer) {
        this.song = song;
        this.composer = composer;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public Composer getComposer() {
        return composer;
    }

    public void setComposer(Composer composer) {
        this.composer = composer;
    }

    @Override
    public String toString() {
        return "SongComposer{" +
                "song=" + song.toString() +
                ", composer=" + composer.toString() +
                '}';
    }
}
