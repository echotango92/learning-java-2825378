package partthree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num < 5){
            System.out.println("Enjoy the good luck a friend brings you.");
        }
        else if(num >= 5){
           System.out.println("Your shoe collection will make you happy today.");
        }
    
    }
   
}
