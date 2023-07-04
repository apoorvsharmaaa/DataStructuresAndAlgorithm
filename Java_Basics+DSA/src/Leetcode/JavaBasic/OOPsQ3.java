package Leetcode.JavaBasic;
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class OOPsQ3 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 5;
        System.out.println(sq.perimeter());
        System.out.println(sq.area());
    }
}
