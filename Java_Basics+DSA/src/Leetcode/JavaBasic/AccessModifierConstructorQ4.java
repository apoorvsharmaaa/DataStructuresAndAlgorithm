package Leetcode.JavaBasic;
class rectanglee{
    private int lenght;
    private int breadth;

    public int getLenght() {
        return lenght;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int b) {
        breadth = b;
    }

    public void setLenght(int l) {
        lenght = l;
    }

    public rectanglee(){
        lenght = 6;
        breadth = 4;
    }
    public rectanglee(int l,int b) {
        lenght = l;
        breadth = b;
    }
}
public class AccessModifierConstructorQ4 {
    public static void main(String[] args) {
        rectanglee rect = new rectanglee(45,56);
        System.out.println(rect.getBreadth());
        System.out.println(rect.getLenght());

    }
}
