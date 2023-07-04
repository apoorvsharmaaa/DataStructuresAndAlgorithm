package Leetcode.JavaBasic;
 class employee{
     static int id;
     String name;
     public void print(){
         System.out.println("My id is "+id);
         System.out.println("and my name is "+name);
     }
 }

public class OOPs {
    public static void main(String[] args) {
        System.out.println("This is our custom class ");

        employee Apoorv = new employee();
        employee Stuti = new employee();
        employee.id = 16;
        Apoorv.id = 07;
        Apoorv.name = "Supreme";

//        System.out.println(Apoorv.name );
//        System.out.println(Apoorv.id);

        Apoorv.print();
    }
}
