package ru.otus.rudnev.basic.extended.classes;

public class Dog extends Animal {
    public Dog(String name, int speedRun, int speedSwim, int stamina) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.stamina = stamina;
    }
    @Override
    public void swim(int distance){
        double time;
        if (distance <= this.stamina){
            time = (double) distance / this.speedSwim;
            this.stamina = stamina - (distance * 2);
            System.out.println(getClass().getSimpleName() + " пробежала " + distance + " метров за " + time + " секунд");
            System.out.println("Остаток выносливости: " + this.stamina);
        }
        else {
            System.out.println("У животного появилось состояние усталости");
        }
    }

}
