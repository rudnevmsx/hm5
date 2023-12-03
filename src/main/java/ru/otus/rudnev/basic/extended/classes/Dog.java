package ru.otus.rudnev.basic.extended.classes;

public class Dog extends Animal {
    public Dog(String name, int speedRun, int speedSwim, int stamina) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.stamina = stamina;
    }
    @Override
    public double swim(int distance){
        int swimmingStaminaCost = 2 * distance;
        if (swimmingStaminaCost > stamina) {
            System.out.println("У животного появилось состояние усталости");
            return -1;
        }
        stamina -= swimmingStaminaCost;
        return distance / speedSwim;
    }

}
