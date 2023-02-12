/**
 * This class helps to find the min and max elements of a given array.
 * @author Elif Lara Oğuzhan
 */

public class FindMinMax {

    // method that returns the minimum integer of the array
    public static int findMin(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    // method that returns the maximum integer of the array
    public static int findMax(int[] array){
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
