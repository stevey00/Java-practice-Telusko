public class Inherit {
    public static void main(String[] args) {
        VeryAdvCalc calc = new VeryAdvCalc();
        int r1 = calc.add(3, 5);
        int r2 = calc.sub(5, 2);
        int r3 = calc.multi(3, 5);
        int r4 = calc.div(10, 2);
        double r5 = calc.power(3, 2);

        System.out.println("Add: " + r1 + " Sub: " + r2);
        System.out.println("Multi: " + r3 + " div: " + r4);
        System.out.println("Power: " + r5);

    }
}
