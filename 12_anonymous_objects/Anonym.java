class Object{
    public Object(){
        System.out.println("Object created");
    }

    public void show(){
        System.out.println("In the show method");
    }
}

public class Anonym{
   public static void main(String[] args) {

        // Object obj; // reference creation
        // obj = new Object(); // object creation and assignment

        new Object().show(); // Anonymous object creation
   }    
}
