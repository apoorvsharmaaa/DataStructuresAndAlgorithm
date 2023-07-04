package Leetcode.JavaBasic;
class employeee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i) {
        id = i;
    }
    public int getId() {
        return id;
    }

}

public class OOPsGetterSetter {
    public static void main(String[] args) {
        employeee Apoorv = new employeee();
        Apoorv.setId(161203);
        Apoorv.setName("Stuti");
        System.out.println(Apoorv.getId());
        System.out.println(Apoorv.getName());
    }
}
