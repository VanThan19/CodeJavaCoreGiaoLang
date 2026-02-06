
package data;


public abstract class Pet {
    protected String name;
    protected int yob;
    protected double weigth;

    public Pet(String name, int yob, double weigth) {
        this.name = name;
        this.yob = yob;
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", yob=" + yob + ", weigth=" + weigth + '}';
    }
    
    
    public abstract double run();
    public abstract void showRecord();
         
   
    
}
