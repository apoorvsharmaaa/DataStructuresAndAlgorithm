package Leetcode.JavaBasic;
class Animals{
    Animals(){     //Constructor of 1st
        System.out.println("I am a Animal");
    }
    Animals(int a){      //1st overloaded
        System.out.println("overloaded" +a);
    }
    int legs;
    public int getX() {
        return legs = 4;
    }

    public void setX(int x) {
        legs = x;
    }
}
class dog extends Animals{
    dog (){     //2nd Constructor
        super(5);
        System.out.println("dog is also an animal");
    }
    dog(int x){    //2nd overloaded
        super(5);
        System.out.println("overloaded of dog" +x);
    }
    dog(int x,int y){     //2nd overloaded +1
        super(x);
        System.out.println("extreme overloaded of dog"  +x +y);
    }
    int tail;

    public int getY() {
        return tail=1;
    }

    public void setY(int y) {
        tail = y;
    }
}
class cat extends dog{
    cat(){    //3rd constructor
        super(5,6);
        System.out.println("Im a cat also an animal");
    }
}

public class Inheritance {
    public static void main(String[] args) {

//        ANIMAL CLASS
        Animals janwar = new Animals();
        System.out.println("legs: " +janwar.getX());

//        DOG CLASS
        dog d = new dog(6,4);
        System.out.println("there are " +d.getX()+" legs");
        System.out.println("and " +d.getY() + " tail");

//        CAT CLASS
        cat c = new cat();
        System.out.println(c.getX());
    }
}
