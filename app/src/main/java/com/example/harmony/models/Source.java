package com.example.harmony.models;

public class Source {

    private String source;
    private String details;

    public Source() {
    }

    public Source(String source) {
        this.source = source;
    }

    public Source(String source, String details) {
        this.source = source;
        this.details = details;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Source{" +
                "source='" + source + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
