public class Largest {
    public static void main(String[] args) {
        int x = 1;
        int y = 5;
        int z = 3;

        if(x>y && x>z)
         System.out.println(x);
        else if(y>z) // no need to check y>x since it's checked above aldy
         System.out.println(y);
        else
         System.out.println(z);
    }
}
