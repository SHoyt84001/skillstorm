package Tuesday;

/*
 * Instance (non-static) fields and methods
 *      -> inboked on objects, use the instance name
 *      -> can directly access instance variables and methods
 * 
 * Static fields and methods
 *      ->invoked using the class itself
 *      -> cannot access instance variables and methods, but can directly access static fields and methods. 
 *  
 * 
 * */
public class Person {
    
    // non-static instance variables
    String name;
    String employer;
    int age;

    public static void main(String[] args){
        System.out.println("Hello!");

        String s1 = "Java";
        String s2 = "Java";

        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));

    }
}
