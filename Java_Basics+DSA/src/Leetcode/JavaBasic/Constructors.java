package Leetcode.JavaBasic;
class MyEmployeee {
    private int id;
    private String name;
    public MyEmployeee(){
        id = 45;
        name = "Apoorv";
    }
    public MyEmployeee(String n,int i){
        id = i;
        name = n;
    }
    public MyEmployeee(String n){
        id = 0;
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}
    public class Constructors{
        public static void main(String[] args) {
          MyEmployeee abc = new MyEmployeee();
//          abc.setId(7);
          System.out.println(abc.getId());
            System.out.println(abc.getName());
        }
    }

