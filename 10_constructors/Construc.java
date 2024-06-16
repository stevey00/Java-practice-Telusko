class Human{
    
    private int age = 29;
    private String name = "Stevey";

    // Constructor
    public Human(){
        System.out.println("in Constructor"); 
        age = 12;
        name = "John";
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;  // The this keyword is a reference to the current object invocking the function. 
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}


public class Construc {
    public static void main(String[] args) {

        Human human = new Human();
        
        System.out.println("Hello, " + human.getName() + " You are " + human.getAge() + " years old");

        // human.setAge(28);
        // human.setName("Stevenson");
        // System.out.println("Hello, " + human.getName() + " You are " + human.getAge() + " years old");
    }
}
