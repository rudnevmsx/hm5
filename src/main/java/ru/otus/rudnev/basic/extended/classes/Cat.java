package ru.otus.rudnev.basic.extended.classes;

public class Cat extends Animal {
    public Cat(String name, int speedRun, int speedSwim, int stamina) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.stamina = stamina;
    }
    @Override
    public void swim(int distance){
        System.out.println("Коты не умеют плавать!");
    }


}