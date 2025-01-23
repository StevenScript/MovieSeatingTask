package com.example.movieseatingtask;


/**
 * Represents a singular seat in the theater.
 * Each seat has:
 * - a row (e.g., 'A', 'B', 'C')
 * - a seat number (e.g., 1 to 10)
 * - a boolean flag to indicate if it is reserved or not.
 */
public class Seat {
    // The row this seat is on (e.g., "A")
    // never changed after it’s initialized in the constructor
    private final String row;

    // The specific seat number within that row (e.g., 1)
    // never changed after it’s initialized in the constructor
    private final int seatNumber;

    // Tracks if seat is reserved (true) or not (false)
    private boolean isReserved;

    /**
     * Constructor for Seat
     * @param row A string for the row (like 'A')
     * @param seatNumber An integer for the seat number (like 1)
     */
    public Seat(String row, int seatNumber) {
        this.row = row;
        this.seatNumber = seatNumber;
        this.isReserved = false; // By default, new seats are not reserved
    }

    // Getter for the row
    public String getRow() {
        return row;
    }

    // Getter for the seat number
    public int getSeatNumber() {
        return seatNumber;
    }

    // Returns true if the seat has been reserved
    public boolean isReserved() {
        return isReserved;
    }

    // Marks the seat as reserved (isReserved = true)
    public void reserve() {
        this.isReserved = true;
    }

    // Marks the seat as available (isReserved = false)
    public void cancel() {
        this.isReserved = false;
    }
}

