public class LargestElement {
    public static void main(String args[]){
       int arr[] = {2, 5, 1, 3, 0};

       var largestElement = arr[0];

       for (int i = 0; i<=arr.length-1; i++){
            if(arr[i]>largestElement){
                largestElement = arr[i];
            }


       }

        System.out.println("Largest Element is " + largestElement);
    }
}