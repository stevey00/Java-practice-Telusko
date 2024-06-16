class A extends Object{
    public A(){
        super();
        System.out.println("In A");
    }
    public A(int a){
        super();
        System.out.println("In int 5 A");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }
    public B(int b){
        super(b);
        System.out.println("In int 5 B");
    }
}


public class ThisSuper {
    public static void main(String[] args) {
        // B obj = new B();
    }
}
