package com.university.model;
public class ClassicalTrack extends Track {
    private final String composer;

    public ClassicalTrack(String title, int durationInSeconds, String composer) {
        super(title, durationInSeconds, Style.CLASSICAL);
        this.composer = composer;
    }

    public String getComposer() {
        return composer;
    }

    @Override
    public String play() {
        return "Playing classical piece: " + getTitle() + " composed by " + composer;
    }
}