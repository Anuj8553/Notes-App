package com.example.notesapp;

import com.google.firebase.Timestamp;

public class Note {
    String title;
    String content;

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    Timestamp timestamp;
    public Note() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }


}
