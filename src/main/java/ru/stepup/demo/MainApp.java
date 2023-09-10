package ru.stepup.demo;


public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName2("Барсик");
        System.out.println(cat.getName2());
        for (int i = 0; i <44; i++) {
            System.out.println("Барсик" + i);
        }
    }
public static int add (int a, int b) {
        return a+b;
}
}


