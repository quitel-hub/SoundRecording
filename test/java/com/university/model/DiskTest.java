package com.university.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DiskTest {

    private Disk disk;

    @Mock
    private Track track1;

    @Mock
    private Track track2;

    @Mock
    private Track track3;

    @BeforeEach
    void setUp() {
        disk = new Disk();
    }

    @Test
    void testCalculateTotalDuration() {
        when(track1.getDurationInSeconds()).thenReturn(200);
        when(track2.getDurationInSeconds()).thenReturn(150);

        disk.addTrack(track1);
        disk.addTrack(track2);

        int total = disk.calculateTotalDuration();
        assertEquals(350, total, "Total duration should be sum of all track durations");
        
        verify(track1, times(1)).getDurationInSeconds();
        verify(track2, times(1)).getDurationInSeconds();
    }

    @Test
    void testSortTracksByStyle() {
        when(track1.getStyle()).thenReturn(Style.ROCK);
        when(track2.getStyle()).thenReturn(Style.CLASSICAL);
        when(track3.getStyle()).thenReturn(Style.POP);

        disk.addTrack(track1); // ROCK
        disk.addTrack(track2); // CLASSICAL
        disk.addTrack(track3); // POP

        disk.sortTracksByStyle();
        List<Track> sorted = disk.getTracks();

        // CLASSICAL, POP, ROCK (відповідно до порядку в enum Style)
        assertEquals(Style.CLASSICAL, sorted.get(0).getStyle());
        assertEquals(Style.POP, sorted.get(1).getStyle());
        assertEquals(Style.ROCK, sorted.get(2).getStyle());
    }

    @Test
    void testFindTracksByDurationRange() {
        when(track1.getDurationInSeconds()).thenReturn(100);
        when(track2.getDurationInSeconds()).thenReturn(200);
        when(track3.getDurationInSeconds()).thenReturn(300);

        disk.addTrack(track1);
        disk.addTrack(track2);
        disk.addTrack(track3);

        List<Track> found = disk.findTracksByDurationRange(150, 250);

        assertEquals(1, found.size());
        assertTrue(found.contains(track2));
    }
    
    @Test
    void testAddNullTrack() {
        disk.addTrack(null);
        assertTrue(disk.getTracks().isEmpty(), "Disk should not add null tracks");
    }
}