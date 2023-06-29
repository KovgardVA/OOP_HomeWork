package Observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgancy implements Publisher {
    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(Vacancy vacancy) {
        for (Observer observer : observers) {
            observer.receiveOffer(vacancy);
        }
    }

    // @Override
    // public void sendOffer(String companyName, double salary) {
    //     for (Observer observer : observers) {
    //         observer.receiveOffer(companyName, salary);
    //     }
    // }

     
}
