package SRP;

public class App {
    public static void createOrder() {
        UI ui = new UI();
        Order order = new Order();

        String name = ui.getData("Введите имя клиента: ");
        String prod = ui.getData("Введите наименование товара: ");
        int qnt = Integer.parseInt(ui.getData("Введите количество: "));
        int price = Integer.parseInt(ui.getData("Введите стоимость: "));

        order.setClientName(name);
        order.setProduct(prod);
        order.setQnt(qnt);
        order.setPrice(price);

        DataManager dm = new DataManager();
        dm.saveToJson(order);
    }
}
