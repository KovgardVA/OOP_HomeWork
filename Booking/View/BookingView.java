package Se005.Booking.View;

import java.util.Collection;
import java.util.Date;

import Se005.Booking.Model.Table;
import Se005.Booking.Presenter.View;
import Se005.Booking.Presenter.ViewObserver;

public class BookingView implements View{

    private ViewObserver observer;

    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void showTables(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    public void reserveTable(Date reservationDate,int tableNo, String name) {
        observer.onReservationTable(reservationDate, tableNo, name);
    }

    @Override
    public void printReservationTableResult(int reservationNo) {
        System.out.printf("Столик успешно забранирован. Номер вашей брони: %d\n\n", reservationNo);
    }

    @Override
    public void printReservationTableError(String errorMessage) {
        System.out.printf("Невозможно забронировать столик.\n%s\n", errorMessage);
    }

    /**
     * Действие клиента (пользователь нажал кнопку изменения бронирования столика)
     * @param oldReservation
     * @param reservationDate
     * @param tableNo
     * @param name
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        observer.offReservationTable(oldReservation, reservationDate, tableNo, name);
    }

    @Override
    public void printReservationChangeResult(int reservationId) {
        System.out.printf("Бронь успешно изменена. Номер вашей новой брони: %d\n", reservationId);
    }

    @Override
    public void printReservationChangeError(String errorMessage) {
        System.out.printf("Невозможно изменить бронь.\n%s\n", errorMessage);
    }
    
}
