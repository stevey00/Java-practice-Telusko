// Object oreinted programming
// Object - Properties and Behaviours

// classes
class Calculator{
    int n1; // properties
    
    public int add(int n2, int n3){ 
        int sum = n2 + n3;
        return sum;
    }
}

public class ClaObj {
    public static void main(String[] args) {
        // primitive types
        int i = 4;
        int j = 5;

        // reference type
        Calculator calc = new Calculator(); // instantiating a new calc obj from Calculator class. 

        int result = calc.add(i, j);


        // int result = i + j;
        System.out.println(result);
    }
    
}

// to run do javac followed by file path, in this case .\clasObj.java
// then run java followed by the class bearing the main method, in this case "ClaObc"