package com.company;
class Circle{
    float pie = 3.14f;
    int r;
    public float area(){
        return pie*(r*r);
    }
    public float perimeter(){
        return 2*pie*r;

    }
}

public class OOPsQ6 {
    public static void main(String[] args) {
        Circle gola = new Circle();
        gola.r = 5;
        System.out.println(gola.area());
        System.out.println(gola.perimeter());

    }
}
