public class Optimal {
    public static boolean isSorted(int[] arr){
        for (int i = 1; i<=arr.length-1; i++){
            if(arr[i-1]> arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
            int[] array = {5,4,6,7,8};
            boolean result = isSorted(array);
            System.out.println(result);
    }
}