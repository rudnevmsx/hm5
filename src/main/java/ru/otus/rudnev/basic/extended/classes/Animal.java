package ru.otus.rudnev.basic.extended.classes;

public abstract class Animal {
    protected String name;
    protected int speedRun;
    protected int speedSwim;
    protected int stamina;

    public double run(int distance){
        if (distance <= this.stamina){
            double time = (double) distance / this.speedRun;
            this.stamina = stamina - distance;
            return time;
        }
        else {
            System.out.println("У животного появилось состояние усталости");
            return 0;
        }
    }

    public void info(){
        System.out.println(getClass().getSimpleName());
        System.out.println("Имя: " + name);
        System.out.println("Скорость бега: " + speedRun);
        System.out.println("Скорость плавания: " + speedSwim);
        System.out.println("Выносливость: " + stamina);
    }

    public abstract double swim(int distance);
}
