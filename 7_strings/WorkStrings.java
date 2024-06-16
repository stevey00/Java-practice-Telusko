public class WorkStrings {
    public static void main(String[] args) {
        String name = new String("Stevey"); // string constructor
        System.out.println("hello " + name);
        System.out.println(name.charAt(2));
        System.out.println(name.concat(" how far"));
        // System.out.println(name.hashCode()); // printing the hash code

        String s1 = "Steve";
        String s2 = "Steve";

        System.out.println(s1 == s2);
    }
}
