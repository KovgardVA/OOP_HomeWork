package Booking.Presenter;

import java.util.Date;

public interface ViewObserver {
    void onReservationTable(Date orderDate, int tableNo, String name);

    void offReservationTable(int reservationNo, Date orderDate, int tableNo, String name);
}
