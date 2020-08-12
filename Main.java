package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int quoteSelector;
       do{
           quoteSelector = (int) (Math.random() * 7);
           System.out.println("The Magic 8-Ball says:");
           switch (quoteSelector) {
               case 0:
                   System.out.println("Outlook Unclear");
                   break;
               case 1:
                   System.out.println("Yes");
                   break;
               case 2:
                   System.out.println("No");
                   break;
               case 3:
                   System.out.println("You're SOL");
                   break;
               case 4:
                   System.out.println("Absolutely");
                   break;
               case 5:
                   System.out.println("Do you expect me to know the future?");
                   break;
               case 6:
                   System.out.println("Only in your dreams!");
                   break;
           }
            System.out.println("Press Enter to see what the 8-Ball says next...");
           s.nextLine();
       }while(true);

    }
}
