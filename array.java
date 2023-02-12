/** 
 * This programme creates an int array with random integers in the range of [0,100]
 * @author İlke Latifoğlu
 * Student ID: 22203818
 */

public class array {

    private int[] newArray;

    public array (int arraySize) {

        newArray = new int[arraySize];
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = (int) (Math.round(Math.random() * 100));
        }

    }

    public int getSize(){
        return newArray.length;
    }

    public int getElement(int i){
        return newArray[i];
    }
    
}
