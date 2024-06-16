class Phone{
    String brand;
    int price;
    // String name;
    static String name; // static variable

    // instance method
    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    // static method
    public static void show1(Phone obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class StcKey {
    public static void main(String[] args) {

        Phone phone1 = new Phone();
        phone1.brand = "Nokia";
        phone1.price = 1500;
        // phone1.name = "Smartphone";
        Phone.name = "Smartphone";  // it's preferable to use the class name to refer to the static variable.

        Phone phone2 = new Phone();
        phone2.brand = "Samsumg";
        phone2.price = 1900;
        // phone2.name = "Smartphone";
        Phone.name = "Smartphone";

        // invocking instance methods
        phone1.show();
        phone2.show();

        // invocking static method 
        Phone.show1(phone1); 
    }
}


/**
 * Types of variables
 * 
 * Primitives built-in data types (Integer, byte, short, long, Float, Double, Character, Boolean)
 * Reference data types (Class, Interface, Array, Enum, Annotated)
 * 
 * instance variables
 * local variables
 * static variables
 * 
 */