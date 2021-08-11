package baitap1_CircleAndCylinder;

public class Circle {
    private String color;
    private double radius;

    public Circle(){}

    public Circle(String color,double radius){
        this.color=color;
        this.radius=radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Hình tròn có bán kính là "
                + radius
                + " và có màu "
                + color
                ;
    }
}
