package ConstructorChaining;

public class Cat extends Animal {
    String catFoodPref;

    /*
     * super()
     *      - calls a constructor from the parent/super class
     *      - must be the first line the subclass constructor
     *      - if you don't call super(), java will implicity call the parent class no-args constructor
     *      - however, if you don't declare the no-args constructor in the parent class, java will give you an error
     */

    public Cat (String name, int age, String catFoodPref){
        super(name, age);
        this.catFoodPref = catFoodPref;
    }

    @Override
    public void makeNoise(){
        super.makeNoise();
        System.out.println("MOW");
    }

    public String getName(){
        return name;
    }
}
