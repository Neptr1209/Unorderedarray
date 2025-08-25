/*
This is a very simple Q&A game. No java methods. Just pure printing out...

Note:
This program has no error handling. Modify as you wish
 */


import java.util.Scanner;
public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctAnswer = 0;
        boolean playAgain =true;

        while (playAgain) {
            System.out.println("*******************");
            System.out.println("Welcome to the Game!");
            System.out.println("*******************");

            // Question 1
            System.out.print("Question 1: \n" +
                    "What's the best programming language? \n" +
                    "1. Python \n" +
                    "2. C/C++ \n" +
                    "3. Java \n" +
                    ">>> ");
            String question1 = scanner.nextLine();
            if (question1.equals("3")) {
                correctAnswer++;
            }

            // Question 2
            System.out.print("Question 2: \n" +
                    "What is Moon? \n" +
                    "1. Cheese \n" +
                    "2. Rocks \n" +
                    "3. Alien Spaceship \n" +
                    ">>> ");
            String question2 = scanner.nextLine();
            if (question2.equals("1")) {
                correctAnswer++;
            }

            // Question 3
            System.out.print("Question 3: \n" +
                    "What's the best food? \n" +
                    "1. Fried Rice \n" +
                    "2. Eggs \n" +
                    "3. Sandwich \n" +
                    ">>> ");
            String question3 = scanner.nextLine();
            if (question3.equals("2")) {
                correctAnswer++;
            }

            // Question 4
            System.out.print("Question 4: \n" +
                    "Who's the best singer? \n" +
                    "1. Justin Bieber \n" +
                    "2. Post Malone \n" +
                    "3. Bruno Mars \n" +
                    ">>> ");
            String question4 = scanner.nextLine();
            if (question4.equals("3")) {
                correctAnswer++;
            }


            // Printing Scores
            System.out.println("*******************");
            System.out.printf("Score: %d/4 \n", correctAnswer);
            if (correctAnswer == 4) {
                System.out.println("Well Done!!!");
            } else if (correctAnswer < 4 && correctAnswer > 2) {
                System.out.println("Nice!");
            } else {
                System.out.println("Study More, Please!!");
            }
            System.out.println("*******************");

            System.out.print("Do You wanna play again? (yes/no): ");
            String optionToPlayAgain = scanner.nextLine().toLowerCase();

            if(!optionToPlayAgain.equalsIgnoreCase("yes")){
                System.out.println("GoodBye...");
                playAgain = false;

            }
        }
        scanner.close();
    }
}


