package Assignment_Day_06;

import java.util.Scanner;

//a. Just like the Armstrong number, the Perfect Number is also a special type of
//positive number. When the number is equal to the sum of its positive divisors
//excluding the number, it is called a Perfect Number. For example, 28 is the perfect
//number because when we sum the divisors of 28, it will result in the same number.
//The divisors of 28 are 1, 2, 4, 7, and 14. So,
//b. 28 = 1+2+4+7
//c. 28 = 28

public class PerfectNumber {
    static long sum = 0;

    long isPerfect(long num, int i) {
//executes until the condition becomes false
        if (i <= num / 2) {
            if (num % i == 0) {
//calculates the sum of factors
                sum = sum + i;
            }
//after each iteration, increments the value of variable i by 1
            i++;
//recursively called function
            isPerfect(num, i);
        }
//returns the sum of factors
        return sum;
    }

    //driver code
    public static void main(String args[]) {
        long number, s;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
//reads a number from the user
        number = sc.nextLong();
//creating an object of the class
        PerfectNumber pne = new PerfectNumber();
        s = pne.isPerfect(number, i);
//compares sum with the number
        if (s == number)
//prints if the s and number are equal
            System.out.println(number + " is a perfect number");
        else
//prints if s and number are not equal
            System.out.println(number + " is not a perfect number");
    }
}
