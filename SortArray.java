import java.util.Arrays;

public class SortArray {
    public static void main(String[] are){
        int[] arr = {5,2,9,1,5,1,3,8,7,100};
        Arrays.sort(arr); // Sorts the array in ascending order
        
        // Print out the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        }
}