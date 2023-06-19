package Booking.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import Booking.Presenter.Model;

public class TableModel implements Model{
    private Collection<Table> tables;

    public Collection<Table> loadTables() {
        if (tables == null) {

            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());

        }
        return tables;
    }

    /**
     * Бронирование столика
     * 
     * @param reservationDate Дата бронирования
     * @param tableNo         Номер столика
     * @param name            Имя клиента
     */
    public int reserveTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(name, reservationDate);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика.");
    }

    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Iterator<Reservation> reservations = table.getReservations().iterator();
                while(reservations.hasNext()) {
                    Reservation reservation = reservations.next();
                    if (reservation.getId() == oldReservation) {
                        reservations.remove();
                    }
                }
                return reserveTable(reservationDate, tableNo, name);
            }
        }
        throw new RuntimeException("Некорректный номер брони.");
    }

}
