package Leetcode.JavaBasic;
class employee1{
    int salary;
    String name;
    public int getsalary() {
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}

public class OOPsQ1 {
    public static void main(String[] args) {
        employee1 apoorv = new employee1();
        apoorv.salary = 140000;
        apoorv.setName("Apoorv");
        System.out.println(apoorv.getname());
        System.out.println(apoorv.getsalary());
    }
}
