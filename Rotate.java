import java.util.Arrays;

public class Rotate {

    public void rotate(int[] nums){
       int temp = nums[0];
       for (int i = 1; i<=nums.length-1; i++){
           nums[i-1] = nums[i];
       }
       nums[nums.length-1] = temp;


    }

    public static void main(String[] args){
        Rotate r = new Rotate();
        int[] arr = {1,2,3,4,5};
        r.rotate(arr);
        System.out.println(Arrays.toString(arr));

    }
}