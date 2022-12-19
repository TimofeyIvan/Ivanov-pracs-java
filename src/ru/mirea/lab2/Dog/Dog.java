package ru.mirea.lab2.Dog;

public class Dog {
    private String name = "";
    private int age = 0;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public int AgeInHuman()
    {
        return age * 7;
    }
    public String toString()
    {
        return String.format("Собака: %s, Возраст: %s", name, AgeInHuman());
    }
}
