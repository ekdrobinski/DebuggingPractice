//null pointer exception: line 18 ---> assigned array as null and created a breakpoint
//array index out of bounds exceptions: line 7 ---> used a popup from error and clicked on it to highlight the for loop
//logic error: line 8 ----> subtract instead of add also created a breakpoint and tried step in, step out
public class Main {
    public static double calculateAverage(int[] numbers) { //moved up here after ; & } errors
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {   //for (int number : numbers) change from this for loop to one that will try to reach one more index than there are ints in the array
            sum -= numbers[i]; //hits the values at index i.
        }
        double average =  sum / numbers.length; //
        return average;
    }
    public static void main(String[] args) { //originally put average method in main method, but since it was void debugging suggested returning a double here. then replaced with void
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(calculateAverage(numbers)); //works: returns 3.0

       //null pointer exception
        int[] numbers1 = null;//assigning null value creates a null pointer exception
        System.out.println(calculateAverage(numbers1));


        //index out of bounds
        int[] numbers2 = {1, 2, 3, 4, 5};
        System.out.println(calculateAverage(numbers2));

    }
}