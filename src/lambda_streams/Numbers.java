package lambda_streams;

import java.util.Arrays;
import java.util.List;

interface Addable {
    int add(int a, Integer b);
}

interface isEven {
    boolean even(Integer a);
}

class Numbers {
    static List<Integer> nums = Arrays.asList(10, 100, 1000, 5, 50, 500, 3, 30, 300, 7, 70, 700, 1, 10, 100, 25, 250,
            2500);

    public static void main(String[] args) {
        //Part I :complete the static class methods that have been set up in this Numbers class java file.  
        //Use streams to compute the results wherever possible.

        // System.out.println(nums);

        //Part II - refactor all of the class methods to accept lambda expressions. 
        // You can put the lambda functions directly inside the method calls, or defined them first, then pass them into the methods. 
        // Give them the same names as the static methods, but add the word 'lambda' in front of every lambda function:
        /* e.g.
        
        added(() -> {});
        
        OR
        
        lambdaAdd = () -> {};
        added(lambdaAdd);
        
        isOdd(() -> {});
        
        OR
        
        lambdaOdd = () -> {};
        isOdd(lambdaOdd);
        etc...
        
        */
        // lambda even
        // ====================================================================
        isEven lambdaEven = (a) -> {
            if (a % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        nums.forEach((n) -> lambdaEven.even(n));
        // ====================================================================
        // lambda add
        // ====================================================================
        int lambdaAddVar = 0;
        Addable lambdaAdded = (a, b) -> {
            return (a + b);
        };
        for (int i = 0; i < nums.size(); i++) {
            lambdaAddVar = lambdaAdded.add(lambdaAddVar, nums.get(i));
            System.out.println(lambdaAddVar);
        }
        // ====================================================================

        // for (int i = 0; i < nums.size(); i++) {
        //     System.out.println("isOdd: ");
        //     isOdd(i);
        //     System.out.println("isEven: ");
        //     isEven(i);
        //     System.out.println("isPrime: ");
        //     isPrime(i);
        // }
        // System.out.println("END");
    }

    static boolean isOdd(int i) {
        //determine if the value at the index i is odd.  return true if yes, return false if  no.
        if (nums.get(i) % 2 != 0) {
            System.out.println("    " + nums.get(i) + " is odd");
            return true;
        } else {
            System.out.println("    " + nums.get(i) + " is not odd");
            return false;
        }
    }

    static boolean isEven(int i) {
        //determine if the value at the index i is even.  return true if yes, return false if  no.
        if (nums.get(i) % 2 == 0) {
            System.out.println("    " + nums.get(i) + " is even");
            return true;
        } else {
            System.out.println("    " + nums.get(i) + " is not even");
            return false;
        }
    }

    static boolean isPrime(int i) {
        //determine if the value at the index i is a prime number.  return true if yes, return false if no.
        boolean flag = false;
        for (int j = 2; j <= nums.get(i) / 2; ++i) {
            // condition for non-prime number
            if (nums.get(i) % j == 0) {
                flag = true;
                break;
            }
        }
        // is prime
        if (!flag) {
            System.out.println("    " + nums.get(i) + " is prime");
            return false;
        }
        // is not prime
        else {
            System.out.println("    " + nums.get(i) + " is not prime");
            return true;
        }
    }

    static int added() {
        //add all the elements in the list.  return the sum.  
        return 0;
    }

    static int subtracted() {
        //subtract all the elements in the list. return the remainder.
        return 0;
    }

    static int multipled() {
        //multiply all the elements in the list. and return the product.
        return 0;
    }

    static int divided() {
        //multiply all the elements in the list. and return the product.
        return 0;
    }

    static int findMax() {
        //return the maximum value in the list.
        return 0;
    }

    static int findMin() {
        //return the minimum value in the list.
        return 0;
    }

    static int compare(int i, int j) {
        //compare the values stored in the array at index position i and j.  
        //if the value at i is greater, return 1.  if the value at j is greater, return -1.  if the two values are equal, return 0.
        return 0;
    }

    static int append(int n) {
        //add a new value to the values list. return that value after adding it to the list.
        nums.add(n);
        System.out.println(n + " has been added to 'nums' array");
        return n;
    }

}
