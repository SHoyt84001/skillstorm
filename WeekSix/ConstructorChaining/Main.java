package ConstructorChaining;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class Main{
    public static void main(String[] args){
        Cat cat1 = new Cat("kitty", 12, "wet food");

        System.out.println(cat1.name + cat1.age + cat1.catFoodPref);

        cat1.makeNoise();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog(dog1.getName(), dog1.getColor(), dog1.getAge(), dog1.getSize());
        dog2.makeNoise();

        int minInclusive = 1;
        int maxInclusive = 20;
        int numberOfRandomNumbers = 20;
        
        List<Integer> randomNumbers = new Random().ints(numberOfRandomNumbers, minInclusive, maxInclusive + 1).boxed().collect(Collectors.toList());
        System.out.println("List of 21 random numbers between 1 and 10: " + randomNumbers);
    
    }
}