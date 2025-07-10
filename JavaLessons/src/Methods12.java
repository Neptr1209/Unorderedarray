

public class Methods12 {
    public static void main(String [] args){

        String name = "bro";
        int age = 2;
        userName(name, age);
        happyBday();

        // Calling squaring up the number (Integer)
        System.out.println(square(3));

        // Calling full name (String)
        System.out.println("Bro"+" Code");

        // Checking Boolean
        int numb = 11;
        if(ageChecking(numb)){
            System.out.println("You are an adult");
        } else{
            System.out.println("You are not an adult");
        }
    }

    // if the main method is static, then the method that it's calling from should also be a static method
    static void happyBday(){
        System.out.println("yayyyy");
        System.out.println("========");
    }

    static void userName(String a, int b){
        System.out.println(a+" "+b);
        System.out.println("========");
    }

    // Squaring up the number
    static double square(double number){
        System.out.println("========");
        return number*number;
    }

    // String method
    static String getFullName(String first, String last){
        System.out.println("========");
        return first + " " + last;
    }

    // Boolean method
    static boolean ageChecking(int age){
        return age >= 18;
        // This is a simplified version of If-statement.
        // This works because the method is already in boolean type.
    }
}
