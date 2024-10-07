package com.example.ex4class;

public class Salesperson extends Employee {
    @Override
    public void calculateSalary(){
        System.out.println("Your salary is - 12000 + 5000 ");

    }

    @Override
    public void getDetails() {
        System.out.println("your name is - Shay");

    }
    public void  performTask(){
        System.out.println("Please start selling more.");
    }
}
