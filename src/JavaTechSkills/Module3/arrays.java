package JavaTechSkills.Module3;
import java.util.Scanner;
/**
 * Created by Komp on 09.09.2017.
 */
public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;
        int reiteration = 0;

        System.out.println("Enter Size of Array:");
        int arraySize = sc.nextInt();
        System.out.println();

        int[] myArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter "+ (i+1) +" Element of Array:");
            myArray[i] = sc.nextInt();
        }

        System.out.println("Now Your Array is:");

        for (int element : myArray) {
            System.out.print(element + "; ");
        }
        System.out.println();

        for (int i = 0; i < arraySize; i++) {
            if (myArray[i] < minElement)
                minElement = myArray[i];
        }
        System.out.println("Minimum number in array: " + minElement);

        for (int i = 0; i < arraySize; i++) {
            if (myArray[i] > maxElement)
                maxElement = myArray[i];
        }
        System.out.println("Maximum number in array: " + maxElement);

        for (int i = 0; i < arraySize; i++) {
            if (myArray[i] == 5)
                reiteration ++;
        }
        System.out.println("Reiteration of number 5 in array: " + reiteration);

        int temp = 0;
        for (int i = 0; i < arraySize; i++) {
            for (int j = 1; j < arraySize - 1; j++) {
                if (myArray[j-1] > myArray[j]){
                    temp = myArray[j-1];
                    myArray[j-1]= myArray[j];
                    myArray[j] = temp;
                }
            }
        }

        System.out.println("Sorting Array Is:");
        for (int element : myArray) {
            System.out.print(element + "; ");
        }


    }
}
