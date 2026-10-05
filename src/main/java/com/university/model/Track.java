package com.university.model;
import java.util.Objects;

public abstract class Track {
    private final String title;
    private final int durationInSeconds;
    private final Style style;

    public Track(String title, int durationInSeconds, Style style) {
        if (durationInSeconds <= 0) {
            throw new IllegalArgumentException("Duration must be positive");
        }
        this.title = title;
        this.durationInSeconds = durationInSeconds;
        this.style = style;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public Style getStyle() {
        return style;
    }

    // Абстрактний метод для демонстрації поліморфізму
    public abstract String play();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return durationInSeconds == track.durationInSeconds && 
               Objects.equals(title, track.title) && 
               style == track.style;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, durationInSeconds, style);
    }

    @Override
    public String toString() {
        return String.format("%s (Style: %s, Duration: %ds)", title, style, durationInSeconds);
    }
}