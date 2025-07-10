

public class PlayGround2 {
    public static void main(String[] arg){
        String[] fruit= {"apple","banana", "watermelon"};
        for(int i=0;i<fruit.length;i++){
            System.out.println(fruit[i]);
        }

        int[] nums = new int[5]; // allocate 5 spaces to store for the array called nums
        nums[0] = 1;
        nums[3] =232+100; // This is manual work in assigning values for arrays

        int[] number = {2,3,4,5,6,7}; // This is auto

        System.out.println(nums[0]); // calling arrays nums- index 0
        System.out.println(nums[3]);
        System.out.println(nums[4]);
        System.out.println(number[5]);
        System.out.println("---------------------------");

        for(int i:number){ // This is called the enhanced loop. It's good for just printing the loop in the array, not for reversing. Modification will be a bit difficult
            System.out.println(i);
        }


        System.out.println("---------------------------");
        int[][][] num = { // 3D arrays
                {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                } };
        System.out.println(num[0][2][2]);
        System.out.println("---------------------------");

        int[] varr = new int[5];
        for(int i =1;i<5;i++){
            varr[i] = i+varr[i-1];
        }
        varr[0] = varr[1]+varr[2];


    }
}
