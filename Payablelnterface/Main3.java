/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Payablelnterface;

/**
 *
 * @author ASUS
 */
interface Payable {
    double pay();
}

class Employee implements Payable {
    double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    @Override
    public double pay() {
        return salary;
    }
}

class Contractor implements Payable {
    double hourlyRate;
    int hours;

    Contractor(double hourlyRate, int hours) {
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double pay() {
        return hourlyRate * hours;
    }
}

public class Main3 {
    public static void main(String[] args) {
        java.util.List<Payable> list = new java.util.ArrayList<>();

        list.add(new Employee(5000000));
        list.add(new Contractor(50000, 40));

        double total = 0;
        for (Payable p : list) {
            total += p.pay();
        }

        System.out.println("Total payment = " + total);
    }
}
