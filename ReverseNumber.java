package Assignment_Day_06;

//In Java, we can reverse a number either by using for loop, while loop, or using recursion.
//The simplest way to reverse a number is by using for loop or while loop. In order to
//reverse a number, we have to follow the following steps:
//a. We need to calculate the remainder of the number using the modulo
//b. After that, we need to multiply the variable reverse by 10 and add the remainder into
//it.
//c. We then divide the number by 10 and repeat steps until the number becomes 0.

public class ReverseNumber {
    // Function to reverse the number
    static int reverse(int n) {

        int rev = 0; // reversed number
        int rem;   // remainder

        while (n > 0) {

            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }

        return rev;
    }

    // Driver Function
    public static void main(String[] args) {
        int n = 4526;

        System.out.print("Reversed Number is " + reverse(n));
    }
}
