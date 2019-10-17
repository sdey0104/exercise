import java.util.ArrayList;
import java.util.Scanner;

public class FindTheMinimumElement {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg) {

        String[] arr = scanner.nextLine().split(" ");

        int[] intArr = new int[arr.length];

        int len = arr.length;

        for (int i = 0; i < len; i++) {
            intArr[i] = (Integer.parseInt(arr[i]));
        }

        System.out.println("The minimum number is " + findMin(intArr));

    }

    public static int findMin(int[] nums) {
        int result = Integer.MAX_VALUE;

        int [] count= new int[10000];
//        for(int c : nums){
//            count[c]++;
//        }

        for(int i =0;i<nums.length;i++){
            if(result>nums[i]){
                result=nums[i];
            }
        }
        return result;
    }
}
