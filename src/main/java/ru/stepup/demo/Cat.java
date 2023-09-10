package ru.stepup.demo;

public class Cat {
    private String name2;
    private String color;
    private int age;

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat() {
    }

    public Cat(String name, String color, int age) {
        this.name2 = name;
        this.color = color;
        this.age = age;
    }


}
