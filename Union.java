import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;


public class Union {
    public static Integer[] union(int[] arr1,int[] arr2){
            Set<Integer> set = new HashSet<>();



            for(int i = 0; i<arr1.length; i++) {
                set.add(arr1[i]);
            }

            for(int i =0; i< arr2.length; i++){
                set.add(arr2[i]);
            }

           Integer[] result = set.toArray(Integer[]::new);

           return result;



    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5};
        Integer[] result =  union(arr1,arr2);
        System.out.println(Arrays.toString(result));


    }
}
