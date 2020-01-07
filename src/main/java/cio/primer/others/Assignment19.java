package cio.primer.others;

/**
 * Write a description of class Assignment19 here.
 * Create an abstract class Shape. Derive three classes sphere, cone 
 * and cylinder from it. Calculate area and volume of all. 
 * (Use Method overriding)	
 * @author (your name) 
 * @version (a version number or a date)
 */

abstract class Shape{
    static double PI=3.14;
    abstract double calArea();
    abstract double calVolume();
}

class Sphere extends Shape{
    int radius;
    
    Sphere(int r){ radius = r;}
    double calVolume() {
        return PI*radius*radius*radius;
    }
    
    double calArea() {
        //Surface Area of sphere
        return 4*PI*radius*radius;
    }
}
class Cylinder extends Shape{
    int radius, height;
    // Sur Area = 2 PI r*r + 2 PI r h
    Cylinder(int r, int h){ 
        radius=r;
        height=h;
    }
    double calVolume() {
        return PI*radius*radius*height;
    }
    
    double calArea() {
        //Surface Area of Cylinder
        return (2*PI*radius*radius + 2*PI*radius*height);
    }
}
class Cone extends Shape{
    int radius, height;
    // Sur Area = 2 PI r*r + 2 PI r h
    Cone(int r, int h){
        radius=r;
        height=h;
    }
    double calVolume() {
        return (PI*radius*radius*height)/3;
    }
    
    double calArea() {
        //Surface Area of Cone
        return (PI*radius*(radius + Math.sqrt(height*height + radius*radius)));
    }
}
public class Assignment19
{
    public static void main(String args[]){
        // Create a Sphere and calculate area and volume
        Sphere sphe = new Sphere(5);
        System.out.println("Area of Sphere with rad=5 is " + sphe.calArea());
        System.out.println("Volume of Sphere with rad=5 is " + sphe.calVolume());
        // Create a Cylinder and calculate area and volume
        Cylinder cyl = new Cylinder(5, 8);
        System.out.println("Area of Cylinder with r=5 &h=8 is " + cyl.calArea());
        System.out.println("Volume of Cylinder with r=5 &h=8 is " + cyl.calVolume());
       
        
        // Create a Cone and calculate area and volume
        Cone kone = new Cone(5, 8);
        System.out.println("Area of Cone with r=5 &h=8 is " + kone.calArea());
        System.out.println("Volume of Cone with r=5 &h=8 is " + kone.calVolume());
       
    }
}
