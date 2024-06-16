public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Stevey");

        System.out.println(sb.capacity()); // view capacity
        System.out.println(sb.length()); // view length
        System.out.println(sb.append(" Igor")); // append string

        // converting from StringBuffer to string
        String str = sb.toString();
        System.out.println(str);
    }
}
