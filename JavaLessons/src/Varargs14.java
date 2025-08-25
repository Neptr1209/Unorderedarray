
/*
Variable arguments
varargs - allows a method to accept a varying number of arguments
It makes methods more flexible, no need for overloaded methods
java will pack the arguments into an array
"..." - (ellipsis)


 */

public class Varargs14 {
    public static void main(String [] args){

        System.out.println(add(1,2,3,4));
        System.out.println(average(1,34,2,3,56));


    }

    static int add(int ...numbers){ // This becomes an array
        int sum =0;

        for(int number: numbers){
            sum+=number;
        }
        return sum;

    }

    static double average(double...numbers){
        double sum=0;

        if(numbers.length==0){
            System.out.println("No arguments input");
        }

        for(double number:numbers){
            sum+=number;
        }
        return sum/numbers.length;
    }
}
