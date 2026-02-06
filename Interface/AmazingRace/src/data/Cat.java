
package data;

import java.util.Random;


public class Cat extends Pet{
    public static final double MAX_SPEED = 30;

    public Cat(String name, int yob, double weigth) {
        super(name, yob, weigth);
    }
    @Override
    public double run() {
        return new Random().nextDouble()*MAX_SPEED;
    }
    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n","CAT",name,yob,weigth,run());
    }
}
