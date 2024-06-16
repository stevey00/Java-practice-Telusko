class Human{
    
    private int age = 29;
    private String name = "Stevey";

    // Default constructor
    public Human(){
        age = 12;
        name = "John";
    }

    // Parametized constructor
    public Human(int a, String n){
        this.age = a;
        this.name = n;
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}


public class ParamCons {
    public static void main(String[] args) {

        Human human = new Human();
        Human human2 = new Human(25, "Samuel");
        
        System.out.println("Hello, " + human.getName() + " You are " + human.getAge() + " years old");
        System.out.println("Hello, " + human2.getName() + " You are " + human2.getAge() + " years old");
    }
}
