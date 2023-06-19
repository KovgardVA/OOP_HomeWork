package Booking;

import java.util.Date;

import Booking.Model.TableModel;
import Booking.Presenter.BookingPresenter;
import Booking.View.BookingView;

public class Program {
    public static void main(String[] args) {
        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();

        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);

        bookingPresenter.showTables();
        bookingView.reserveTable(new Date(), 4, "Logan");
        bookingView.reserveTable(new Date(), 4, "Mary");
        bookingView.reserveTable(new Date(), 4, "Bill");
        bookingView.reserveTable(new Date(), 4, "Sally");

        bookingView.changeReservationTable(1002, new Date(), 4, "Mary");
    }
}
