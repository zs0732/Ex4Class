package com.example.ex4class;

public class Developer extends Employee{
    @Override
    public void calculateSalary(){
        System.out.println("Your salary is - 12000 + 6000 ");

    }

    @Override
    public void getDetails() {
        System.out.println("your name is - Itzik");

    }
    public void  performTask(){
        System.out.println("Get better at software development.");
    }
}
