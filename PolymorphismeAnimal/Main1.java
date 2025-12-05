/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolymorphismeAnimal;

/**
 *
 * @author ASUS
 */
class Animal {
    void speak() {
        System.out.println("Animal speaks...");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog: Woof!");
    }
    
    void fetch() {
        System.out.println("Dog is fetching...");
    }
}

class Bird extends Animal {
    @Override
    void speak() {
        System.out.println("Bird: Tweet!");
    }
}

public class Main1 {
    public static void main(String[] args) {
        java.util.List<Animal> animals = new java.util.ArrayList<>();

        animals.add(new Dog());
        animals.add(new Bird());
        animals.add(new Dog());

        for (Animal a : animals) {
            a.speak();  
            
            if (a instanceof Dog) {
                ((Dog) a).fetch();
            }
        }
    }
}

