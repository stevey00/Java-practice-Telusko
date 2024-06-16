public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 6;
        
        // Runs at least once. Executes before it checks for the condition. 
       do{
            System.out.println("Hi " + i);
            
            i++;
        } while(i<=5);

    }
}
