package Assignment_Day_06;

//Fibonacci series is a special type of series in which the next term is the sum of the
//previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
//the next term will be 1(0+1).

public class FibonacciSeries {
    static int n1 = 0;
    static int n2 = 1;
    static int n3 = 2;

    public static void main(String[] args) {
        int count = 10;
        System.out.println(n1 + " " + n2);
        PrintFibonacci(count - 2);
    }

    static int PrintFibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println("" + n3);
            PrintFibonacci(count - 1);

        }
        return count = 0;
    }

}