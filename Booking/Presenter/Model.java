package Booking.Presenter;

import java.util.Collection;
import java.util.Date;

import Booking.Model.Table;

public interface Model {
    Collection<Table> loadTables();

    int reserveTable(Date reservationDate, int tableNo, String name);

    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
