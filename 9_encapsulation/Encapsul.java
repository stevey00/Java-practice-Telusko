class Human{
    // Encapsulation implies making sure properties and methods are kept private to the class
    private int age = 29;
    private String name = "Stevey";

    // getters
    public void setAge(int a){
        age = a;
    }

    public void setName(String n){
        name = n;
    }

    // setters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class Encapsul {
    public static void main(String[] args) {

        Human human = new Human();
        
        // System.out.println(human.name + " " + human.age);  // can't be accessed directly outside the 'Human' class

        human.setAge(28);
        human.setName("Stevenson");
        System.out.println("Hello, " + human.getName() + " You are " + human.getAge() + " years old");
    }
}
