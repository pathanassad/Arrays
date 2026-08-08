import java.util.Arrays;
import java.util.Scanner;

public class RotateByN {

    public void rotate(int[] arr)
    {
        Scanner sc  = new Scanner(System.in);
        int k = sc.nextInt();

        int[] temp = new int[k];

        // storing k elements in temp array
        for (int i = 0; i<k; i++){
            temp[i] = arr[i];
        }

        // shifting

        for(int j = k; j<=arr.length-1; j++){
            arr[j-k] = arr[j];
        }

        // put back

        for (int a = arr.length - k; a<arr.length; a++){
            arr[a] = temp[a- (arr.length - k)];
        }

        System.out.println("Array has been rotated " +Arrays.toString(arr));


    }

    public static void main(String[] args){
        RotateByN rotate = new RotateByN();
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        rotate.rotate(array);

    }

}
