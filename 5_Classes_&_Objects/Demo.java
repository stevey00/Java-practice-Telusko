class Computer{
    public void playMusic(){
        System.out.println("Music is playing...");
    }

    public String getMeAPen(int cost){
        if(cost >= 10)
            return "Pen";     
        return "Nothing";  
    }
}

// method overloading
class Calculator{
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }
}

public class Demo {
    public static void main(String[] args) {
        // Computer computer = new Computer();

        // computer.playMusic();
        // String str = computer.getMeAPen(20);

        // System.out.println(str);

        Calculator calculator = new Calculator();

        int res = calculator.add(1, 3);

        System.out.println(res);
    }
}
