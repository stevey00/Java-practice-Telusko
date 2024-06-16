class Phone{
    String brand;
    int price;
    static String name;

    // static block
    static{
        name = "Smartphone";
        System.out.println("In static block");
    }

    // class constructor
    public Phone(){
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }

    // instance method
    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}


public class StaticBlock {
    public static void main(String[] args) {
        
        Phone phone1 = new Phone();
        phone1.brand = "Nokia";
        phone1.price = 1500;

        // Phone phone2 = new Phone();

        phone1.show();
    }
}
