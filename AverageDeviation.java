public class AverageDeviation {

    public static int findAverage(int[] inputArray) {
        int arraySum = 0;
        int arrayAverage = 0;
        for(int i = 0; i<inputArray.length; i++) {
            arraySum += inputArray[i];
        }
        arrayAverage = arraySum / inputArray.length;
        return arrayAverage;
    }
    
    public static int[] findDeviation(int[] inputArray) {

        int[] deviatedArray = new int[inputArray.length];
        for(int k = 0; k<inputArray.length; k++) {
            deviatedArray[k] = inputArray[k] - findAverage(inputArray);
        }
        return deviatedArray;
    }
}
