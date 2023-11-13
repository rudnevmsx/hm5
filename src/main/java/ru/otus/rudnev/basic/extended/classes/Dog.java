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
        if (distance <= this.stamina){
            double time = (double) distance / this.speedSwim;
            this.stamina = stamina - (distance * 2);
            return time;
        }
        else {
            System.out.println("У животного появилось состояние усталости");
            return 0;
        }
    }

}
