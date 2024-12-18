package com.dsa.arrays;

import static java.lang.Math.abs;

public class HasSubarrayWithProduct {
    public  static void main(String arg[]){
        int[] arr = {-2, -1, 3, -4, 5}; // Input array
        int product = -3; // Target product value

        // Check if there is a subarray with the given product and print the result
        if (hasSubarrayWithProduct(arr, product)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private  static boolean hasSubarrayWithProduct(int arr[],int k){
        boolean isPossible = Boolean.FALSE;
        int product=1;
        int start = 0;
        //-2, -1, 3, -4, 5
        for (int end = 0; end < arr.length; ++end) {
            product *= arr[end];

            // If the product becomes zero and k is not zero, move the start to skip zero
            while (start <= end && product == 0 && k != 0) {
                start++;
                product = 1;
                for (int i = start; i <= end; ++i) {
                    product *= arr[i];
                }
            }

            // If product exceeds k, move the start pointer to reduce the product
            while (start <= end && product != 0 && abs(product) > abs(k)) {
                product /= arr[start];
                start++;
            }

            // Check if the current product is equal to k
            if (product == k) {
                return true;
            }

        }
        return isPossible;
    }
}
