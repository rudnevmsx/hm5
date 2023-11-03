package ru.otus.rudnev.basic.extended.classes;

public abstract class Animal {
    protected String name;
    protected int speedRun;
    protected int speedSwim;
    protected int stamina;

    public void run(int distance){
        double time;
        if (distance <= this.stamina){
            time = (double) distance / this.speedRun;
            this.stamina = stamina - distance;
            System.out.println(getClass().getSimpleName() + " пробежала " + distance + " метров за " + time + " секунд");
            System.out.println("Остаток выносливости: " + this.stamina);
        }
        else {
            System.out.println("У животного появилось состояние усталости");
        }
    }

    public void info(){
        System.out.println(getClass().getSimpleName());
        System.out.println("Имя: " + name);
        System.out.println("Скорость бега: " + speedRun);
        System.out.println("Скорость плавания: " + speedSwim);
        System.out.println("Выносливость: " + stamina);
    }

    public abstract void swim(int distance);
}
