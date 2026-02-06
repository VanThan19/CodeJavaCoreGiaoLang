
package data;

import java.util.Random;


public class Dog extends Pet implements Dua {
    
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weigth) {
        super(name, yob, weigth);
    }
    @Override
    public double run() {
        return new Random().nextDouble()*MAX_SPEED;
    }
    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n","DOG",name,yob,weigth,run());
    }

    @Override
    public double runToDead() {
        return run() * 5;
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n","DOG-Đua",name,yob,weigth,runToDead());
    }
    
}
