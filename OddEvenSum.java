/**
 * This class helps find the sum of elements with odd- and even-numbered indexes.
 * @author Can Polat Bülbül
 */
public class OddEvenSum {
    public static int findEvenSum(int[] intArray){
        int sum = 0;

        for(int i=0;i<intArray.length;i += 2){
            sum = sum + intArray[i];
        }

        return sum;
    }
    public static int findOddSum(int[] intArray){
        int sum = 0;
        
        for(int i=1;i<intArray.length;i += 2){
            sum = sum + intArray[i];
        }

        return sum;
    }
}
