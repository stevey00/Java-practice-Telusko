public class Switch {
    public static void main(String[] a) {
        // int n = 7;
        String day = "Monday";

        // if else block

        // if(n==1)
        //  System.out.println("Monday");
        // else if(n==2)
        //  System.out.println("Tuesday");
        // else if(n==3)
        //  System.out.println("Wednesday");
        // else if(n==4)
        //  System.out.println("Thursday");
        // else if(n==5)
        //  System.out.println("#friday");
        // else if(n==6)
        //  System.out.println("Saturday");
        // else
        //  System.out.println("Sunday");


        // switch (previous)

        // switch(n){
        //     case 1:
        //      System.out.println("Monday");
        //      break;
        //     case 2:
        //      System.out.println("Tuesday");
        //      break;
        //     case 3:
        //      System.out.println("Wednesday");
        //      break;
        //     case 4:
        //      System.out.println("Thursday");
        //      break;
        //     case 5:
        //      System.out.println("#friday");
        //      break;
        //     case 6:
        //      System.out.println("Saturday");
        //      break;
        //     case 7:
        //      System.out.println("Sunday");
        //      break;
        //     default: 
        //      System.out.println("Enter a valid number (1-7)");
        // }

        // switch (updated)  "string supported, breaks can be ommited."

        // switch(day){
        //     case "Saturday", "Sunday" -> System.out.println("6am");
        //     case "Monday" -> System.out.println("8am");
        //     default -> System.out.println("7am");
        // }

        // assigning switch values directly to a variable

        String res = "";

        // switch(day){
        //     case "Saturday", "Sunday" -> res ="6am";
        //     case "Monday" -> res = "8am";
        //     default -> res = "7am";
        // }

        // Or  wiil end with a (;) since it's now a statement.

        // res = switch(day){
        //     case "Saturday", "Sunday" -> "6am";
        //     case "Monday" -> "8am";
        //     default -> "7am";
        // };

        // Or  you can use : yeild instead of the arrow.

        res = switch(day){
            case "Saturday", "Sunday" : yield "6am";
            case "Monday" : yield "8am";
            default : yield "7am";
        };

        System.out.println(res);
    }
}
