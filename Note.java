package com.example.notesapp;

import com.google.firebase.Timestamp;

public class Note {
     static String title;
     //TODO string changed to static to use in widget
    String content;


    Timestamp timestamp;
    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }


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
