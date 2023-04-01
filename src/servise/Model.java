package servise;

import model.Drinks;
import model.Fruits;

import java.util.Scanner;

public class Model {
    private String name;
    private int price;
    private int qolich;

    public Model(String name, int price, int qolich) {
        this.name = name;
        this.price = price;
        this.qolich = qolich;
    }

    public Model() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQolich() {
        return qolich;
    }

    public void setQolich(int qolich) {
        this.qolich = qolich;
    }
    public void methAll() {
        Drinks dr = new Drinks();
        Fruits fr = new Fruits();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Что вы хотите купить?\nФрукты\nНапитки");
            String str2 = scan.nextLine();
            if (str2.equals("Фрукты")) {
                fr.methFruits();
                break;
            } else if (str2.equals("Напитки")) {
                dr.methDrinks();
                break;
//            } else if (str2.equals("Пепси")) {
//                methPepsi();
            } else {
                System.out.println("Мындай продукт жок!");
            }
        }
    }
}
