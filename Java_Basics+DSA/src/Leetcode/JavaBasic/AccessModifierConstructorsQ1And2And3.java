package Leetcode.JavaBasic;
class Cylinder{
   private int radius;
   private int height;

//   contructor   q3
   public Cylinder(int r,int h){
       radius = r;
       height = h;
   }
   double pie = 3.14;
   public void SurfaceArea(){
      double  SurfaceArea =  2 * pie * radius * (radius + height);
       System.out.println("Surface area of a cylinder is: " + SurfaceArea);
   }
   public void Volume(){
       double Volume = pie * (radius * radius) * height;
       System.out.println("Volume of a cylinder is: " + Volume);
   }


    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        height = h;
    }

    public void setRadius(int r) {
        radius = r;
    }
}

public class AccessModifierConstructorsQ1And2And3 {
    public static void main(String[] args) {
//        Cylinder cylinder = new Cylinder();    //question 1 sollution
//        cylinder.setHeight(4);
//        cylinder.setRadius(5);

        Cylinder cylinder = new Cylinder(5,4);  //question 3 sollution
        System.out.println("The height of a cylinder is: " + cylinder.getHeight());
        System.out.println("The radius of a cylinder is: " + cylinder.getRadius());

//        Q2
        cylinder.SurfaceArea();
        cylinder.Volume();



    }
}
