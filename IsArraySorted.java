public class IsArraySorted {
    public static boolean isArraySorted(int[] arr){
        boolean status = true;
        for (int i = 0; i< arr.length-1; i++){
            for (int j = i+1; j<=arr.length-1; j++){
                if(arr[i]>arr[j]){
                    status = false;
                    break;
                }
                break;
            }
        }
        return status;
    }

    public static void main(String[] args){
        int[] array = {5,4,6,7,8};
        boolean result = isArraySorted(array);
        System.out.println(result);
    }
}