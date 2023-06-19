package Booking.Presenter;

import java.util.Collection;

import Booking.Model.Table;

public interface View {
    void showTables(Collection<Table> tables);

    void setObserver(ViewObserver observer);

    void printReservationTableResult(int reservationId);

    void printReservationTableError(String errorMessage);

    void printReservationChangeResult(int reservationId);
    
    void printReservationChangeError(String errorMessage);

}
