package com.example.ex4class;

public class Manager extends Employee {
    @Override
    public void calculateSalary(){
        System.out.println("Your salary is - 12000 + 5000 + 6000 ");

    }

    @Override
    public void getDetails() {
        System.out.println("your name is - albert");

    }
    public void  performTask(){
        System.out.println("You are a lovely worker.");
    }
}
