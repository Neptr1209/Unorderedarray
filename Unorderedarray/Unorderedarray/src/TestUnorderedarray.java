public class TestUnorderedarray {
    public static void main(String[] args) {
        // ---------- TEST UNORDERED ARRAY ----------
        System.out.println("=== Testing UnorderedArray ===");
        Unorderedarray ua = new Unorderedarray(5);

        ua.insert(10);
        ua.insert(20);
        ua.insert(30);
        System.out.println("Size: " + ua.size());          // should be 3
        System.out.println("Find 20: " + ua.find(20));     // should be index 1
        System.out.println("Get index 2: " + ua.get(2));   // should be 30

        ua.delete(20);
        System.out.println("After delete, size: " + ua.size()); // should be 2

        ua.resize(10);
        System.out.println("After resize, size: " + ua.size()); // should still be 2
    }

}
