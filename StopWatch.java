package Assignment_Day_06;

import java.util.Scanner;

//a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
//the start and end clicks
//b. I/P -> Start the Stopwatch and End the Stopwatch
//c. Logic -> Measure the elapsed time between start and end
//d. O/P -> Print the elapsed time.

public class StopWatch {
    public static void main(String[] args) {

        //Variable Declaration
        long start = 0, stop = 0;

        //Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //Showing StopWatch options to user
        while (true) {
            System.out.println("1. Start StopWatch \n2. Stop StopWatch \n3. Exit");

            System.out.println("Enter your Choice :");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    //Getting the Starting Time of Stopwatch from system in nanoseconds
                    start = System.nanoTime();
                    System.out.println("Start Time :" + start);
                    break;
                case 2:
                    //Calculating the Seconds to be lapsed by starting and ending time
                    stop = System.nanoTime();
                    long sec = ((stop - start) / 1000000000);
                    System.out.println("edn Time :" + stop);
                    int min = (int) sec / 60;
                    int hr = min / 60;
                    System.out.println("Elapsed Time is " + hr + ":" + min + ":" + sec);
                    break;
            }

            if (choice >= 3) {
                System.out.println("Closing the Stopwatch.");
                break;

            }
        }
    }
}
