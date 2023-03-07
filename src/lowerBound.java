// Java program to find lower bound
// using binarySearch() method of Arrays class

// Importing Arrays utility class
import java.util.Arrays;

// Main class
public class lowerBound {

    // Method 1
    // To find lower bound using binary search
    // implementation of Arrays utility class
    static int lower_bound(int array[], int key)
    {

        int index = Arrays.binarySearch(array, key);

        // If key is not present in the array
        if (index < 0) {
            // Index specify the position of the key
            // when inserted in the sorted array
            // so the element currently present at
            // this position will be the lower bound
            return Math.abs(index) - 1;
        }

        // If key is present in the array
        // we move leftwards to find its first occurrence
        else {

            // Decrement the index to find the first
            // occurrence of the key

            while (index > 0) {

                // If previous value is same
                if (array[index - 1] == key)
                    index--;

                    // Previous value is different which means
                    // current index is the first occurrence of
                    // the key
                else
                    return index;
            }

            return index;
        }
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        //
        int array[]
                = { 4, 6, 10, 12, 18, 18, 20, 20, 30, 45 };
        int key = 18;

        // Sort the array before applying binary search
        Arrays.sort(array);

        // Printing the lower bound
        System.out.println(lower_bound(array, key));
    }
}
