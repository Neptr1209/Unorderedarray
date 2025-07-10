public class Arithmetic_Operator {
    public static void main(String[] args){
        int x = 10;
        int y = 3;
        int z;
        int zz;

        z = x+y;
        zz = x % y;

        // Augmented assignment operators:
        x += y; // This is the same as x = x +y; we have -=, +=, /=, *=, %=
        System.out.println(z);
        System.out.println(zz);
        System.out.println(x);

        // ---------------- Increment and decrement operators-----
        // Increment:
        int x1 = 1;
        x1++; // Same as x += 1;
//      x1++; // Try uncomment these two and re-run
//      x1++; // They continuously add up
        System.out.println(x1);

        // Decrement operators:
        int x2 = 3;
        x2--; // Same meaning as increment.
        x2--;
        System.out.println(x2);

        //-------------------------------------------
        // Order of Operations [P-E-M-D-A-S]
        /*
        Parentheses, Exponents, Mulitiplication, Division, Addition, Substraction
         */

    }
}
