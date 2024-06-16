public class ForLoop {
    public static void main(String[] args) {
       
        // printing days of the week with hours
        // for(int i = 1; i <= 7; i++) {
        //     System.out.println("Day " + i);  

        //     for(int j = 9; j <= 12; j++) {
        //         System.out.println("    " + j + " am"); 
        //     }
        //     for(int k = 1; k <= 9; k++) {
        //         System.out.println("    " + k + " pm"); 
        //     }
        //     System.out.println("\n");
        // }

        // for(int i = 1; i <= 5; i++) {
        //     System.out.println("DAY " + i);  

        //     for(int j = 1; j <= 9; j++) {
        //         System.out.println("    " + (j + 8) + " - " + (j + 9)); 
        //     }
        // }
        
        // Seperating the initialization, condition and increment in a for loop.
        int i = 1;
        for(; i <= 5;) {
            System.out.println("DAY " + i);  

            for(int j = 1; j <= 9; j++) {
                System.out.println("    " + (j + 8) + " - " + (j + 9)); 
            }

            i++;
        }
    }
}
