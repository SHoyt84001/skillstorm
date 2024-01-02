package ConstructorChaining;

public class Dog extends Animal{
    private String name; 
    private String color; 
    private int age; 
    private String size;

    public Dog(){
        this("john", "blue", 5, "small");
    }

    public Dog(String name, String color, int age, String size){
        this.name = name;
        this.color = color;
        this.age = age;
        this.size = size;
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public int getAge(){
        return age;
    }
    
    public String getSize(){
        return size;
    }

    @Override
    public void makeNoise(){
        System.out.println("BORK");
    }
}
