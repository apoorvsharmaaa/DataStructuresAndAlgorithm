package Leetcode.JavaBasic;
class sphere{
   private double pie = 3.14;
   private int radius;
   public void Volume(){
       double Volume = 4/3*pie*(radius*radius*radius);
       System.out.println("The volume of a sphere is: "+Volume);
   }
   public void SurfaceArea(){
       double SurfaceArea = 4 * pie *(radius*radius);
       System.out.println("The Surface Area of a sphere is: "+SurfaceArea);
   }
   sphere(){
       radius = 451;
   }
   sphere(int r){
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        radius = r;
    }
}

public class AccessModifierConstructorQ5 {
    public static void main(String[] args) {
        sphere s = new sphere(12);
//        s.setRadius(45);
        System.out.println("Radius: "+s.getRadius());
        s.Volume();
        s.SurfaceArea();

    }
}
