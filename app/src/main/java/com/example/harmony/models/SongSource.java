package com.example.harmony.models;

import java.util.Date;

public class SongSource {
    private Song song;
    private Source source;
    private Date date;

    public SongSource() {
    }

    public SongSource(Song song, Source source) {
        this.song = song;
        this.source = source;
    }

    public SongSource(Song song, Source source, Date date) {
        this.song = song;
        this.source = source;
        this.date = date;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SongSource{" +
                "song=" + song.toString() +
                ", source=" + source.toString() +
                ", date=" + date +
                '}';
    }
}
