public class SecondLargest {

    public static void find(int[] arr){
        if(arr.length<=1){
            System.out.println(-1);
        }

        int largestElement = arr[0];
        int smallestElement = arr[0];

        int secondSmallest = Integer.MAX_VALUE;
        int secondLargest = Integer.MIN_VALUE;


        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i]> largestElement)
                largestElement = arr[i];
            if (arr[i]< smallestElement)
                smallestElement = arr[i];
        }





        for(int j = 0; j<=arr.length-1; j++){
          if(arr[j]!=largestElement && arr[j]>secondLargest){
              secondLargest = arr[j];
          }
          if(arr[j]!=smallestElement && arr[j]<secondSmallest){
              secondSmallest = arr[j];
          }
        }

        if(arr.length>1)
            System.out.println("second smallest element is " + secondSmallest + " second largest is " + secondLargest);


    }
    public static void main(String[] args){
        int arr[] = {1, 2, 4, 7, 7, 5};
        find(arr);
    }

}