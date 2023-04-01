package model;

import servise.Model;

import java.util.Objects;
import java.util.Scanner;

public class Fruits extends Model {

    public void methBan() {
        Scanner sc = new Scanner(System.in);
        this.setName("Банан");
        if (Objects.equals(getName(), "Банан")) {
            System.out.println("Банан");
            this.setPrice(20);
            System.out.println("Цена фрукта: " + this.getPrice() + " com");
            System.out.println("Введите нужную массу фрукта");
            this.setQolich(sc.nextInt());
            System.out.println("Наименование фрукта: " + getName() + "\nЦена: " + getPrice() + " com" + "\nМасса: " + getQolich() + "kg\nС вас: " + getPrice() * getQolich() + " com");

        } else {

            System.out.println("Введен не правильный фрукт!");
        }
    }

    public void methApple() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            this.setName("Яблоко");
            if (Objects.equals(getName(), "Яблоко")) {
                System.out.println("Яблоко");
                this.setPrice(50);
                System.out.println("Цена фрукта: " + this.getPrice() + " com");
                System.out.println("Введите нужную массу фрукта");
                this.setQolich(sc.nextInt());
                System.out.println("Наименование фрукта: " + getName() + "\nЦена: " + getPrice() + "\nМасса: " + getQolich() + "kg\nС вас: " + getPrice() * getQolich() + " com");
                break;
            } else {
                System.out.println("Введен не правильный фрукт!");
            }
        }
    }
    public void methPers() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            this.setName("Персик");
            if (Objects.equals(getName(), "Персик")) {
                System.out.println("Персик");
                this.setPrice(70);
                System.out.println("Цена фрукта: " + this.getPrice() + " com");
                System.out.println("Введите нужную массу фрукта");
                this.setQolich(sc.nextInt());
                System.out.println("Наименование фрукта: " + getName() + "\nЦена: " + getPrice() +" сом"+ "\nМасса: " + getQolich() + "kg\nС вас: " + getPrice() * getQolich() + " com");
                break;
            } else {
                System.out.println("Введен не правильный фрукт!");
            }
        }
    }
    public void methFruits() {
        System.out.println("Какой фрукт вы хотите купить?\nБанан\nЯблоко\nПерсик");
        Scanner scan = new Scanner(System.in);
        while (true) {
            String str2 = scan.nextLine();
            if (str2.equals("Банан")) {
                methBan();
                break;
            } else if (str2.equals("Яблоко")) {
                methApple();
                break;
            } else if (str2.equals("Персик")) {
                methPers();
            } else {
                System.out.println("Мындай фрукт жок!");
            }
        }
    }
}
