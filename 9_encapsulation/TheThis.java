class Human{
    
    private int age = 29;
    private String name = "Stevey";

    public int getAge() {
        return age;
    }
    
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;  // The this keyword is a reference to the current object invocking the function. 
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class TheThis {
    public static void main(String[] args) {

        Human human = new Human();
        
        // System.out.println(human.name + " " + human.age);  // can't be accessed directly outside the 'Human' class

        human.setAge(28);
        human.setName("Stevenson");
        System.out.println("Hello, " + human.getName() + " You are " + human.getAge() + " years old");
    }
}
