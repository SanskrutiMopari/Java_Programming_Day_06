package Assignment_Day_06;

//Just like the Perfect number, the Prime number is also a special type of number. When
//the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
//number. 0 and 1 are not counted as prime numbers. All the even numbers can be
//divided by 2, so 2 is the only even prime minister.

public class PrimeNumber {

    static boolean isPrime(int n, int i) {
        if (n <= 2) return (n == 2) ? true : false;
        if (n % i == 0) return false;
        if (i * i > n) return true;

        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        int n = 11;

        if (isPrime(n, 2)) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }
}

