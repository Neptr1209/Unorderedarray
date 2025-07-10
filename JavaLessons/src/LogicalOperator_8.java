
/*

&& = AND
|| = OR
! = NOT

 */


public class LogicalOperator_8 {
    public static void main(String[] args){
        double temp = 20.1;
        boolean isSunny = true;

        if(temp<=23 && temp>=0 && isSunny){
            System.out.println("Today is sunny");
        }
        else if(temp<=23 && temp>=0 && !isSunny){
            System.out.println("Today is cloudy");
        }
    }
}
