package com.university.model;
public class RockTrack extends Track {
    private final boolean hasGuitarSolo;

    public RockTrack(String title, int durationInSeconds, boolean hasGuitarSolo) {
        super(title, durationInSeconds, Style.ROCK);
        this.hasGuitarSolo = hasGuitarSolo;
    }

    public boolean isHasGuitarSolo() {
        return hasGuitarSolo;
    }

    @Override
    public String play() {
        return "Playing rock track: " + getTitle() + (hasGuitarSolo ? " with an epic guitar solo!" : "");
    }
}