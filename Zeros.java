import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zeros {
    public static void move(int[] arr){


        // store non zeros in new list

        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i<arr.length; i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }

        // put back non zeros in the original array

        for (int i = 0; i<temp.size(); i++){
            arr[i] = temp.get(i);
        }

        // add zeros in the end

        for (int i = temp.size(); i<arr.length;i++){
            arr[i] = 0;
        }

    }
    public static void main(String[] args){

        int[] array = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
//        move(array);
        optimal(array);
        System.out.println(Arrays.toString(array));

    }

    public static void optimal(int[] arr){
        int j = -1 ;

        for (int i =0; i<arr.length; i++){
            if(arr[i]==0){
                j = i;
                break;
            }
        }

        for (int i = j+1; i<arr.length; i++){
            if(arr[i]!=0){
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
                 j++;
            }


        }
    }
}
