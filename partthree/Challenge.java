package partthree;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        String question = "What sound does a dog make?";
        String choiceOne = "quack";
        String choiceTwo = "woof";
        String choiceThree = "oink";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);

        Scanner input = new Scanner(System.in);
        String answer = input.next();

        if(correctAnswer.equals(answer.toLowerCase())){
            System.out.println("That is correct! Congrats!");
        }else{
            System.out.println("Sorry, the the correct answer is " + correctAnswer);
        }
        
    }
}
