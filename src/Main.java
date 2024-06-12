public class Main {
    public static void main(String[] args) {

        /*
        * Selection sort :: swap values!
        * 1. Create an Array
        * 2. Store the Array length into a variable
        * 3. Need to go through every element in the Array
        *   3.1. Outer loop will loop through every element the n amount of times we have elements
        *        // if we have 5 elements we will loop through the array 5 times
        *        // We start from 0 index and go to the last index
        *        // variable with the length of the array goes with - 1 because the array starts with index 0
        *   3.2. The second check, and sort the array using for loop
        *        3.3. if condition to check if the next value is smaller then the current element
        *             when its bigger = > min_index = j;
        *
        *  4. Swapping the two elements
        *  5. Printing out the sorted array's
        * */


        int [] array = {5,3,7,9,2,4,1};
        int n = array.length;

        for(int i = 0 ; i < n - 1 ; i++){

        int min_index = i;

            for (int j = i + 1 ; j < n ; j++){

                if(array[min_index] > array[j]){
                min_index = j;
                }

            }

            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }

        System.out.print("Sorted array: ");
        for (int i = 0 ; i < n ; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();


    }
}