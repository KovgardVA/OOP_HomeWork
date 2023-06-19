package Booking.Presenter;

import java.util.Collection;
import java.util.Date;

import Booking.Model.Table;

public class BookingPresenter implements ViewObserver {

    private final Model model;
    private final View view;

    public BookingPresenter(Model tableModel, View bookingView) {
        model = tableModel;
        view = bookingView;
        view.setObserver(this);
    }

    private Collection<Table> loadTables() {
        return model.loadTables();
    }

    public void showTables() {
        view.showTables(loadTables());
    }

    public void printReservationTableResult(int reservationId) {
        view.printReservationTableResult(reservationId);
    }

    public void printReservationTableError(String errorMessage) {
        view.printReservationTableError(errorMessage);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try {
            int reservationId = model.reserveTable(orderDate, tableNo, name);

            printReservationTableResult(reservationId);
        }
        catch (RuntimeException e) {
            printReservationTableError(e.getMessage());
        }
    }

    public void printReservationChangeResult(int reservationId) {
        view.printReservationChangeResult(reservationId);
    }

    public void printReservationChangeError(String errorMessage) {
        view.printReservationChangeError(errorMessage);
    }

    @Override
    public void offReservationTable(int reservationNo, Date orderDate, int tableNo, String name) {
        try {
            int newReservationId = model.changeReservationTable(reservationNo, orderDate, tableNo, name);

            printReservationChangeResult(newReservationId);
        }
        catch(RuntimeException e) {
            printReservationChangeError(e.getMessage());
        }
    }
}
