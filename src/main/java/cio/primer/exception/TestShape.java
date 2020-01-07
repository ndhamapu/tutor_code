package cio.primer.exception;
import java.io.*;

abstract class Shape
{
    float r;
    Shape(float ra){ r=ra;}
    abstract void area();
   abstract void volume();
}
class Sphere extends Shape
{
    float ar,volume;
    Sphere(float ra)
    {
        super(ra);
    }
    void area()
    {
        ar = 4* 3.142f * r * r;
        System.out.println("Area Of Sphere = " + ar);
    }
    void volume()
    {
        volume = (4* 3.142f * r * r) / 3;
        System.out.println("Volume Of Sphere =" +volume);
    }
}
class Cylinder extends Shape
{
    float ar,volume,height;
    Cylinder(float r,float height)
    {
        super(r);
        this.height=height;
    }
    void area()
    {
        ar = 2 * 3.142f * r * (height+r);
        System.out.println("Area Of Cylinder = " + ar);
    }
    void volume()
    {
        volume = 3.142f * r * r * height;
        System.out.println("Volume Of Cylinder =" +volume);
    }
}
class Cone extends Shape
{
    float ar,volume,height,length;
    Cone(float r, float height,float length)
    {
        super(r);
        this.height=height;
        this.length=length;
    }
    void area()
    {
        ar = 3.142f * r * (length+r);
        System.out.println("Area Of Cone = " + ar);
    }
    void volume()
    {
        volume = (3.142f * r * r * height)/3;
        System.out.println("Volume Of Cone =" +volume);
    }
}
public class TestShape
{
    public static void main(String args[])
    {
        Sphere sp = new Sphere(3.4f);
        Cylinder cl = new Cylinder(5.6f,7.5f);
        Cone cn = new Cone(7.8f,4,5);
        sp.area();
        sp.volume();
        cl.area();
        cl.volume();
        cn.area();
        cn.volume();
    }
}
        

        
