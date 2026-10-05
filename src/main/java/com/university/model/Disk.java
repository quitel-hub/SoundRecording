
package com.university.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Disk {
    private final List<Track> tracks;

    public Disk() {
        this.tracks = new ArrayList<>();
    }

    public void addTrack(Track track) {
        if (track != null) {
            tracks.add(track);
        }
    }

    public List<Track> getTracks() {
        return new ArrayList<>(tracks); // Повертаємо копію для інкапсуляції
    }

    public int calculateTotalDuration() {
        return tracks.stream()
                .mapToInt(Track::getDurationInSeconds)
                .sum();
    }

    public void sortTracksByStyle() {
        tracks.sort(Comparator.comparing(Track::getStyle));
    }

    public List<Track> findTracksByDurationRange(int minSeconds, int maxSeconds) {
        return tracks.stream()
                .filter(track -> track.getDurationInSeconds() >= minSeconds && track.getDurationInSeconds() <= maxSeconds)
                .collect(Collectors.toList());
    }
}