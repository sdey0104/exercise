package Cylinder;

public class Cylinder extends Circle {

    protected double height;

    public Cylinder(double radius, double height){
        super(radius);
        if (height < 0) {
            height=0;
        }
        this.height=height;
    }


    public double getHeight() {
        return height;
    }

    public double getVolume (){
        return getHeight()*getArea();
    }
}
