package com.university;
import com.university.model.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Disk disk = new Disk();

        disk.addTrack(new RockTrack("Bohemian Rhapsody", 354, true));
        disk.addTrack(new ClassicalTrack("Symphony No. 5", 420, "Ludwig van Beethoven"));
        disk.addTrack(new RockTrack("We Will Rock You", 122, false));
        disk.addTrack(new ClassicalTrack("Four Seasons - Spring", 210, "Antonio Vivaldi"));

        System.out.println("--- All tracks ---");
        disk.getTracks().forEach(track -> System.out.println(track.play()));

        System.out.println("\nTotal duration: " + disk.calculateTotalDuration() + " seconds");

        System.out.println("\n--- Sorted by Style ---");
        disk.sortTracksByStyle();
        disk.getTracks().forEach(System.out::println);

        int minRange = 100;
        int maxRange = 250;
        System.out.println("\n--- Tracks between " + minRange + " and " + maxRange + " seconds ---");
        List<Track> foundTracks = disk.findTracksByDurationRange(minRange, maxRange);
        foundTracks.forEach(System.out::println);
    }
}