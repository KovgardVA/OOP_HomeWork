package Booking.Model;

import java.util.Date;

public class Reservation {
    
    private static int counter = 1000;
    private final int id;
    private String name;
    private Date date;

    {
        id = ++counter;
    }

    public int getId() {
        return id;
    }

    public Reservation(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return String.format("%d %s %s", id, name, date);
    }
}
