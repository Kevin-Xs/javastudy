package Lesson2;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        while (!input.equals("bye")) {
            String[] fruits = input.split(" "); //* convert the space delimited string to an array, so we can use "for-each" loop */
            for (String fruit : fruits) {     
                switch (fruit) {
                    case "apple":
                        System.out.println("the price for "+fruit+" is: $1.2");
                        break;
                    case "banana":
                        System.out.println("the price for "+fruit+" is: $2.2");
                        break;
                    case "pear":
                        System.out.println("the price for "+fruit+" is: $3.2");
                        break;            
                    case "peach":
                        System.out.println("the price for "+fruit+" is: $4.2");
                        break;
                    case "strawberry":
                        System.out.println("the price for "+fruit+" is: $5.2");
                        break;                                                        
                    default:
                        break;
                }
            };
            input = myScanner.nextLine();
        };
    }
}
