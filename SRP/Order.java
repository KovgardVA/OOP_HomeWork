package SRP;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {

    private Scanner scanner = new Scanner(System.in);
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public Order() {

    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    public void inputFromConsole() {
        clientName = prompt("clientName");
        product = prompt("product");
        qnt = Integer.parseInt(prompt("qnt"));
        price = Integer.parseInt(prompt("price"));
    }

    private String prompt(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + clientName + "\",\n");
            writer.write("\"product\":\"" + product + "\",\n");
            writer.write("\"qnt\":" + qnt + ",\n");
            writer.write("\"price\":" + price + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
