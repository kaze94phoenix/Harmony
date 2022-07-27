package com.example.harmony.models;

public class Audio {
    private Song song;
    private User author;
    private String url;

    public Audio(Song song, User author, String url) {
        this.song = song;
        this.author = author;
        this.url = url;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "song=" + song.toString() +
                ", author=" + author.toString() +
                ", url='" + url + '\'' +
                '}';
    }
}
