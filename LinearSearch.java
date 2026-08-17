
public class LinearSearch {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};
        LinearSearch ls = new LinearSearch();
        int result = ls.linearSearch(array,9);
        System.out.println(result);
    }

    public int linearSearch(int[] array, int num){
        for(int i = 0; i<array.length; i++){
            if(num==array[i]){
                return i;
            }
        }
        return -1;
    }
}
