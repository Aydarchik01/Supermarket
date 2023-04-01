package model;

import servise.Model;

import java.util.Objects;
import java.util.Scanner;

public class Drinks extends Model {
    public void methCola() {
        Scanner sc = new Scanner(System.in);
        this.setName("Кола");
        if (Objects.equals(getName(), "Кола")) {
            System.out.println("Кола");
            this.setPrice(60);
            System.out.println("Цена напитка: " + this.getPrice() + " com");
            System.out.println("Введите нужное коли" +
                    "чество");
            this.setQolich(sc.nextInt());
            System.out.println("Наименование напитка: " + getName() + "\nЦена: " + getPrice() + " com" + "\nКоличество: " + getQolich() + "штук\nС вас: " + getPrice() * getQolich() + " com");

        } else {

            System.out.println("Введен не правильный продукт!");
        }
    }

    public void methFanta() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            this.setName("Фанта");
            if (Objects.equals(getName(), "Фанта")) {
                System.out.println("Фанта");
                this.setPrice(65);
                System.out.println("Цена напитка: " + this.getPrice() + " com");
                System.out.println("Введите нужное количество");
                this.setQolich(sc.nextInt());
                System.out.println("Наименование напитка: " + getName() + "\nЦена: " + getPrice() + "\nКоличество: " + getQolich() + "штук\nС вас: " + getPrice() * getQolich() + " com");
                break;
            } else {
                System.out.println("Введен не правильный продукт!");
            }
        }
    }
    public void methPepsi() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            this.setName("Пепси");
            if (Objects.equals(getName(), "Пепси")) {
                System.out.println("Пепси");
                this.setPrice(65);
                System.out.println("Цена напитка: " + this.getPrice() + " com");
                System.out.println("Введите нужное количество");
                this.setQolich(sc.nextInt());
                System.out.println("Наименование напитка: " + getName() + "\nЦена: " + getPrice() + "\nКоличество: " + getQolich() + "штук\nС вас: " + getPrice() * getQolich() + " com");
                break;
            } else {
                System.out.println("Введен не правильный продукт!");
            }
        }
    }
    public void methDrinks() {
        System.out.println("Какой напиток вы хотите купить?\nКола\nФанта\nПепси");
        Scanner scan = new Scanner(System.in);
        while (true) {
            String str2 = scan.nextLine();
            if (str2.equals("Кола")) {
                methCola();
                break;
            } else if (str2.equals("Фанта")) {
                methFanta();
                break;
            } else if (str2.equals("Пепси")) {
                methPepsi();
            } else {
                System.out.println("Мындай продукт жок!");
            }
        }
    }
}
