
package data;

import java.util.Random;

public class Motor implements Dua {
    public static final double MAX_SPEED = 180;
    private String model;
    private String volume;
    private String vin;

    public Motor(String model, String volume, String vin) {
        this.model = model;
        this.volume = volume;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Motor{" + "model=" + model + ", volume=" + volume + ", vin=" + vin + '}';
    }
    public double run() {
        return new Random().nextDouble()*MAX_SPEED; // chạy ngẫu nhiên và k quá 180 km/h
    }
    public void showRecord() {
        System.out.printf("|%-10s|%-15s|%-8s|%11s|%5.1f|\n","MOTOR",model,volume,vin,run());
    }

    @Override
    public double runToDead() {
      return run()*3;  // run giả sử tối đa 1560*3 thì đua đến chết luôn  
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-10s|%-10s|%-8s|%11s|%5.1f|\n","MOTOR-Đua",model,volume,vin,runToDead());
    }
    
}
