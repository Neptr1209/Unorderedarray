

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double firstNum;
        char operator;
        double secondNum;
        double result=0;
        boolean validOperation = true;

        System.out.print("Enter your 1st number: ");
        firstNum = scanner.nextDouble();

        System.out.print("Choose the operator: \n1. + \n2. - \n3. * \n4. / \n:");
        operator = scanner.next().charAt(0);

        System.out.print("Enter your 2nd number: ");
        secondNum = scanner.nextDouble();

        switch(operator){
            case '+' -> result = firstNum+secondNum;
            case '-' -> result = firstNum-secondNum;
            case '*' -> result = firstNum*secondNum;
            case '/' -> {
                    if(secondNum==0){
                        System.out.println("Cannot divide by zero");
                        validOperation = false;
                    } else {
                        result = firstNum/secondNum;
                    }
            }
            default -> {
                System.out.println("Enter the right operator");
                validOperation = false;
            }
        }
        if(validOperation) {
            System.out.printf("The result is: %.5f", result);
        }
        scanner.close();
    }
}
