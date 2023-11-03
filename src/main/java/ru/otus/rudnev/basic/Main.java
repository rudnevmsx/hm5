package ru.otus.rudnev.basic;

import ru.otus.rudnev.basic.extended.classes.*;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 15, 20, 50);
        Dog dog = new Dog("Лапа", 20, 25, 60);
        Horse horse = new Horse("Гром", 30, 15, 100);

        cat.run(10);
        cat.run(50);
        cat.info();

        dog.run(10);
        dog.swim(10);
        dog.info();

        horse.run(10);
        horse.swim(10);
        horse.info();
    }
}