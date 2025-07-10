
import java.util.Random;
public class Random_Numbers {
    public static void main(String[] args){
        Random random = new Random();
        int largeNumber;
        int smallerNumber;
        double decimalNumber;
        boolean isItHeads;


        largeNumber= random.nextInt();
        System.out.println("Larger number "+largeNumber); // The number generated will be very large. Range from -2 billion to +2 billion

        smallerNumber = random.nextInt(1,7); // This puts the range from 1 until 6. 7 doesnt count
        System.out.println("Smaller number "+smallerNumber);

        decimalNumber = random.nextDouble(); // This puts the range from 0 until 1.
        System.out.println("Smaller number "+decimalNumber);

        isItHeads = random.nextBoolean(); // This random outputs true or false randomly
        System.out.println("Did I get a head?: "+isItHeads);
        if(isItHeads){
            System.out.println("Yes. You got HEAD!");
        }
        else {
            System.out.println("You got TAILS");
        }

    }
}
