
/*
for loop = execute some code a certain amount of time
while loop = sometimes, execute forever, stuck in a loop

break - you stop the entire program/loop
continue - you ignore/skip whatever is in the loop and continue doing something else (main loop)
 */


import java.util.Scanner;

public class ForLoop10 {
    public static void main(String [] args) throws InterruptedException {

        for(int i=0;i<10;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("===");
        for(int j=0;j<10;j+=2){
            if(j==4){
                break;
            }
            System.out.println(j);
        }
        countDown();
    }

    public static void countDown() throws InterruptedException{
        System.out.println("===Count Down===");
        for(int z = 10; z>0;z--){
            System.out.println(z);
            Thread.sleep(1000); // Use this to delay time for 1 second to print other number. When using this, we need to add throws InterruptedException in the main class and the method...
        }
        System.out.println("Happy new year!");

    }
}
