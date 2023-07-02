package com.company;
class TheEmployee{
    private int Salary;

    public TheEmployee(){
        Salary = 50000;
    }
    public TheEmployee(int money){
        Salary = money;
    }

    public int getSalary() {
        return Salary;
    }
    public void setSalary(int Paisa) {
        Salary = Paisa;
    }
}

public class ConstructorsOverloadingQuestion {
    public static void main(String[] args) {
        TheEmployee Fresher = new TheEmployee();
//        Fresher.setSalary(10000);
        System.out.println(Fresher.getSalary());
    }
}
