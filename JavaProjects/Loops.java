

public class Loops {
    public static void main(String[] args) {
        LeftAlignedRightAngledTriangle(4);
        RightAlignedRightAngledTriangle(4);
        Pyramid(3);
        InvertedLeftAlignedTriangle(5);
        InvertedPyramid(3);
        Diamond(3,3);
        HollowSquare(5);
        HollowPyramid(4);
        HourGlass(4,4);
        NumberedPyramid(4);

    }

    public static void LeftAlignedRightAngledTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------");
        /*
        I learned something new about incremention.
         */
    }

    public static void RightAlignedRightAngledTriangle(int rows){
        for(int i=1;i<=rows;i++){
            for(int j =1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------");
        /*
        Now this is similar to the first code, just need to add some space as we increment through i, then we print *. Not too bad.
         */
    }
    public static void Pyramid(int rows){
        for(int i=1;i<=rows;i++){
            for(int j =1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------");
        /*
        Okay so i did learn something about spaces in front of the *. I thought the first star is in the middle of 2 spaces on left and right. Actually no, I was wrong
        I also learned how to print the * using k<=2*i-1
         */
    }

    public static void InvertedLeftAlignedTriangle(int rows){
        for (int i = 1; i <= rows;i++) {
            for (int j = 1; j <= rows-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------");
        /*
        Honestly, this was quite easy as I just need to print it in reverse from the first code by doing a subtraction of the rows (j<= rows-i) in int j
         */
    }

    public static void InvertedPyramid(int rows){
        for(int i=rows;i>=1;i--){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------");
        /*
        This is a bit tricky. The hard part was finding a way to start from 5 stars down to 1. All I had to do was to assign value i to rows
         */
    }
    public static void Diamond(int rows1, int rows2){
        for(int i=1;i<=rows1;i++){
            for(int j=1;j<=rows1-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows2-1;i>=1;i--){
            for(int j=1;j<=rows2-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------");
        /*
        This one was actually fun because all I had to do was to combine the pyramid with the inverted pyramid code. Nothing new.
         */
    }

    public static void HollowSquare(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++) {
                if (i == 1 || j == 1|| j==rows||i==rows) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------");
        /*
        Okay, this one was hard. Although I did something smart for once for finding the long lines first (the top and bottom stars)
         */
    }
    public static void HollowPyramid(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++) {
                if(i==rows){
                    System.out.print("*");
                }
                else if(k==1||k==2*i-1) {
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }
        System.out.println("-----------------");
        /*
        This took me sometimes. I find it difficult to understand the else if in the k if statement.
         */
    }
    public static void HourGlass(int rows1, int rows2){
        // Inverted Pyramid
        for(int i=rows1;i>=2;i--){
            for(int j=1;j<=rows1-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++) {
                if(i==rows1){
                    System.out.print("*");
                }
                else if(k==1||k==2*i-1) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Regular Pyramid
        for(int i=1;i<=rows2;i++){
            for(int j=1;j<=rows2-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++) {
                if(i==rows2){
                    System.out.print("*");
                }
                else if(k==1||k==2*i-1) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------");
        /*
        This was easy as I just need to reverse the hollow pyramid. All I had to do was to write for(int i=rows1;i>=2;i--){  at the start that's it. I copied
        from the regular hollow pyramid code and modified using this line I just mentioned.
         */
    }
    public static void NumberedPyramid(int rows){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            // This is to print the right side. Try removing this part and run to see for yourself
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
        System.out.println("---------------");
    }
    /*
        This was fun and smart move. I like how I thought about dividing a part of the code and run it.
     */
}