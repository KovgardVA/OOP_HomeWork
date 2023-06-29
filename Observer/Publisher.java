package Observer;

public interface Publisher {
    /**
     * Регистрация нового соискателя.
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * Убрать соискателя из списка.
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * Компания отправляет новую вакансию.
     * @param companyName
     * @param salary
     */
    void sendOffer(Vacancy vacancy);
    // void sendOffer(String companyName, double salary);
}
