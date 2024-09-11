
// Написать метод, возвращающий 
// количество чётных элементов массива.
// countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0 
import java.util.Arrays;


public class Main {
    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                count++;
    
        }
        return count;
    }
    public static void main(String[] args) {
           int[] array = {2, 5, 7, 8, 3, 1};
    Arrays.sort(array);
    System.out.println(array[array.length - 1] - array[0]);
    }

}