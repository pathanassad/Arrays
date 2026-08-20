public class MissingNumber {
    public static int bruteForce(int[] arr){
        int n = arr.length + 1;
        for(int i  = 1; i<=n; i++){
           boolean found = false;
           for(int j = 0; j<n-1; j++){
               if(arr[j] == i){
                   found = true;
                   break;
               }
           }

           if(!found)
               return i;
        }

     return -1;

    }


    public static int optimal(int[] arr){
          int n  = arr.length + 1;

          // storing
        int[] hashArray = new int[n + 1];

        for(int i = 0; i<n-1; i++){
            hashArray[arr[i]]++;
        }

        // fetching
        for(int i = 1; i<hashArray.length; i++){
            if(hashArray[i]==0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        int number = bruteForce(arr);
        int result = optimal(arr);
        System.out.println(number);
        System.out.println(result);

    }

}
