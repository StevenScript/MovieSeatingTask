package com.example.movieseatingtask;

import java.util.ArrayList;
import java.util.List;

/**
 * Theater class represents one auditorium of that movie theater.
 * Contains multiple seats in rows.
 */
public class Theater {
    // A list to hold all the Seat objects.
    private List<Seat> seats = new ArrayList<>();

    /**
     * Constructor for Theater.
     * Calls an initialization method that creates a default layout.
     */
    public Theater() {
        initializeSeats();
    }

    /**
     * Populates the seats list with Seat objects.
     * Example: rows A, B, and C, each with seat numbers 1 through 5.
     */
    private void initializeSeats() {
        // We want rows A through C (A, B, C).
        // Notice that 'char row = 'A'' is a character, and row <= 'C' means A, B, C.
        for (char row = 'A'; row <= 'C'; row++) {
            // For each row, create seats numbered 1 to 5.
            for (int seatNum = 1; seatNum <= 5; seatNum++) {
                // Convert the row character to a String using String.valueOf(row).
                seats.add(new Seat(String.valueOf(row), seatNum));
            }
        }
    }

    /**
     * Getter method that allows external code to see the list of seats.
     * @return A list of Seat objects.
     */
    public List<Seat> getSeats() {
        return seats;
    }
}