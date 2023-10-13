


import java.io.*;
import java.util.*;

interface Ope 
{
    final float PI = 3.142f;

    void area();

    void volume();
}

class Cylinder implements Ope {
    int radius, height;

    Scanner sc = new Scanner(System.in);

    public void acc() {
        System.out.print("Enter radius: ");
        radius = sc.nextInt();
        System.out.print("Enter height: ");
        height = sc.nextInt();
    }

    public void area() {
        double a = (2 * PI * radius * height) + (2 * PI * radius * radius);
        System.out.print("Area: " + a);
    }

    public void volume() {
        double v = PI * radius * radius * height;
        System.out.print("\nVolume: " + v);
    }
}

class seta3 {
    public static void main(String args[]) {
        Cylinder b = new Cylinder();
        b.acc();
        b.area();
        b.volume();
    }
}
