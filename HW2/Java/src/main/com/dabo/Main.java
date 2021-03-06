package main.com.dabo;

import java.awt.*;

public class Main {

    public static int sum_for(int n) {
        int i = 0, sum = 0;
        for (i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sum_while(int n) {
        int i = 0, sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static int smallest_tail_recursive_function(int n) {
        if (n == 0) {
            return 5;
        } else {
            return smallest_tail_recursive_function(n - 1);
        }
    }

    public static int recPow(int n) {
        if (n < 0 || n > 30) {
            throw new IllegalArgumentException("n has to be >= 0 and <= 30");
        } else if (n == 0) {
            return 1;
        } else {
            return 2 * recPow(n - 1);
        }
    }

    public static int gcd(int n,int m) {
        if (m == n) {
            return m;
        } else if (m > n) {
            return gcd(m - n, n);
        } else {
            return gcd(m, n - m);
        }
    }

    public static void main(String[] args) {
	    // write your code here
        System.out.println("Hello World \n");

        // question 1, a
        Circle circle = new Circle();
        circle.draw();
        circle.draw(Color.black);

        ColoredCircle colored_circle = new ColoredCircle();
        colored_circle.draw();

        // question 1, b
        // colored_circle = (ColoredCircle) circle;

        // question 1, c
        circle = colored_circle;
        circle.draw();

        System.out.println();

        // question 2, c
        int i = 5;
        i = i + 5;

        // question 2, e
        int factorial_result = fact(7);

        System.out.println(factorial_result + "\n");

        // question 2, f
        int tail_recursive_result = smallest_tail_recursive_function(10);

        System.out.println(tail_recursive_result + "\n");

        // question 4
        System.out.println(recPow(30) + "\n");

        // question 5
        int[] array = {2, 24, 6, 123, 82, 81, 9, 12, -3};
        MergeSort.mergeSort(array);

        for (int a: array) {
            System.out.println(a);
        }
        System.out.println();

        // question 6
        int gcd_result = gcd(18, 6);

        System.out.println(gcd_result + "\n");
    }
}
