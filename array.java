/** 
 * This programme creates an int array with random integers in the range of [0,100]
 * @author İlke Latifoğlu
 * Student ID: 22203818
 */

public class array {

    public static int[] createArray (int arraySize) {

        int[] newArray = new int[arraySize];
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = (int) (Math.round(Math.random() * 100));
        }
        return newArray;
    }
    
}
