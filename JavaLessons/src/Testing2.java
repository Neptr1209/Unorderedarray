public class Testing2 {

    /**
     * This class represents a Dog.
     * @author Alice
     */
    static class Dog { // You can hover your cursor on this function and you will see the description of what it does
        /* The breed of the dog */
        String breed;

        /**
         * Make the dog bark.
         */
        public void bark() { // You can hover your cursor on this function and you will see the description of what it does
            System.out.println("Woof!");
        }
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.breed = "Labrador";
        myDog.bark();
    }
}
