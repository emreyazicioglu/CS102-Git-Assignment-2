/*
 * Git Assignment 2 Menu
 * date: 2.12.2023
 * @author Emre Yazicioglu
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int op = 0;
        int[] ar = {};
        String s = "";

        do {     
            s = "";
            s += "1 - create array\n";
            s += "2 - find min\n";
            s += "3 - find max\n";
            s += "4 - find average and deviations\n";
            s += "5 - find sum of odd and even indexes\n";
            s += "0 - quit\n";

            System.out.print(s);

            op = in.nextInt();

            if(op == 1) {
                System.out.print("enter array size: ");
                int size = in.nextInt();
                ar = array.createArray(size);
                System.out.println("array created with size " + size);
                for(int i = 0; i < size; i++) {
                    System.out.print(ar[i] + " ");
                }
                System.out.println();
            } else if(op == 2) {
                int mn = FindMinMax.findMin(ar);
                System.out.println("minimum of the array is: " + mn);
            } else if(op == 3) {
                int mx = FindMinMax.findMax(ar);
                System.out.println("maximum of the array is: " + mx);
            } else if(op == 4) {
                int ave = AverageDeviation.findAverage(ar);
                int[] dev = AverageDeviation.findDeviation(ar);
                System.out.println("average of the array is: " + ave);
                int size = ar.length;
                for(int i = 0; i < size; i++) {
                    System.out.print(dev[i] + " ");
                }
                System.out.println();
            } else if(op == 5) {
                int oddSum = OddEvenSum.findOddSum(ar);
                int evenSum = OddEvenSum.findEvenSum(ar);
                System.out.println("sum of odd indexes is: " + oddSum);
                System.out.println("sum of even indexes is: " + evenSum);
            }
        }
        while(op != -1);
    }
}