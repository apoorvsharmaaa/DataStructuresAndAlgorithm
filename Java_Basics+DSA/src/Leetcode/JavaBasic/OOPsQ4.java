package Leetcode.JavaBasic;
class rectangle{
     int length;
     int breadth;
     public int area(){
         return length * breadth;
     }
     public int perimeter(){
         return 2*(length + breadth);
     }
}

public class OOPsQ4 {
    public static void main(String[] args) {
        rectangle rect = new rectangle();
        rect.length = 3;
        rect.breadth = 2;
        System.out.println(rect.area());
        System.out.println(rect.perimeter());
    }
}
