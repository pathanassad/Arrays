import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Duplicates {
    public void bruteForce(int[] arr){
       Set<Integer> result = new HashSet<>();
        for (int i = 0;i<arr.length; i++){
                result.add(arr[i]);
        }
        int index = 0;
        for(int a: result){
            arr[index] = a;
            index++;
        }
        System.out.println("there are " + result.size() + " unique elements in the array");
        System.out.println(Arrays.toString(arr));
    }

    public int optimal(int[] arr){
        int i = 0;
        for (int j = 1; j<arr.length; j++){
            if(arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }

        }
        System.out.println(Arrays.toString(arr));
        return i+1;
    }

    public static void main(String[] args){
        Duplicates dup = new Duplicates();
        int[] array = {1,1,2,2,2,3,3};
        int[] source = {1,1,2,2,2,3,3};
        dup.bruteForce(array);
        int unique = dup.optimal(source);
        System.out.println(unique);
    }
}