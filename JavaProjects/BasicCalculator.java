import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double firstNum = 0;
        char operator;
        double secondNum = 0;
        double total = 0;

        System.out.println("===BASIC CALCULATOR===\n");
        System.out.print("Enter your 1st number: ");
        firstNum = scanner.nextDouble();

        
        System.out.print("Choose the operator: \n1. + \n2. - \n3. * \n4. / \n:");
        operator = scanner.next().charAt(0);
        while (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%'){
            System.out.print("Invalid operator! Please enter again: ");
            operator = scanner.next().charAt(0);
        }

        System.out.print("Enter your 2nd number: ");
        secondNum = scanner.nextDouble();

        switch(operator){
            case '+' -> total = add((int)firstNum,(int)secondNum);
            case '-' -> total = deduct((int)firstNum,(int)secondNum);
            case '*' -> total = multiply((int)firstNum,(int)secondNum);
            case '/' -> {
                if(secondNum==0){
                    System.out.println("Cannot divide by zero");
                } else {
                    total = divide((int)firstNum,(int)secondNum);
                }
            }
            case '%' -> total = modulo((int)firstNum,(int)secondNum);
            default -> System.out.println("Enter the right operator");
        }
        System.out.println("The result is: "+ total);

        reset(total);
        

        scanner.close();

    }
    static int add(int a, int b){
        return a + b;
    }

    static int deduct(int a, int b){
        return a - b;
    }

    static int multiply(int a, int b){
        return a * b;
    }

    static int divide(int a, int b){
        return a / b;
    }

    static int modulo(int a, int b){
        return a % b;
    }

    static void reset(double total_num){
        total_num = 0;
        System.out.println("Resetting the total...");
        System.out.println("Current total after reset is: " + total_num);
    }
}
