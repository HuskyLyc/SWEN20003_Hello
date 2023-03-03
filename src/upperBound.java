// Java program for finding upper bound
// using linear search

// Importing Arrays utility class
import java.util.Arrays;

// Main class
class upperBound {

    // Method 1
    // To find upper bound of given key
    static int upper_bound(int arr[], int key)
    {
        int upperBound = 0;

        while (upperBound < arr.length) {
            // If current value is lesser than or equal to
            // key
            if (arr[upperBound] <= key)
                upperBound++;

                // This value is just greater than key
            else{
                System.out.print("The upper bound of " + key + " is " + arr[upperBound] + " at index " + upperBound);
                return upperBound;
            }
        }
        System.out.print("The upper bound of " + key + " does not exist.");
        return -1;
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Custom array input over which upper bound is to
        // be operated by passing a key
        int array[] = { 10, 20, 30, 30, 40, 50 };
        int key = 30;

        // Sort the array using Arrays.sort() method
        Arrays.sort(array);

        // Printing the upper bound
        upper_bound(array, key);
    }
}
