package com.dsa.search;

/*  Given two sorted arrays a[] and b[] and an element k,
    the task is to find the element that would be at the
    kth position of the combined sorted array.

        Examples :
            Input: a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5
            Output: 6
            Explanation: The final combined sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element of this array is 6.
*/
public class KthElementOfTwoArrays {
    public static void main(String[] args) {
        int a[] ={2, 3, 6, 7, 9};
        int b[] ={1, 4, 8, 10};
        int target = 5;
        int result = kthElement(a,b,target);
        System.out.println(result);
    }
    public static  int kthElement(int a[], int b[], int k) {
        int indexValue =-1;
        int i=0,j=0;
        int arr[] = new int[a.length+b.length];
        int storeCounter=0;
        while (i < a.length-1 && j< b.length-1){
            if(a[i]<b[j]){
                storeCounter++;
                if(storeCounter == k){
                    indexValue =a[i];
                    break;
                }
                i++;
            }else if(b[j]<a[i]) {
                storeCounter++;
                if(storeCounter == k){
                    indexValue =b[j];
                    break;
                }
                j++;
            }
        }
        if(i < a.length && indexValue != -1){
            while (i<a.length){
                storeCounter++;
                if(storeCounter == k){
                    indexValue =a[i];
                    break;
                }
                i++;
            }
        }
        if(j < b.length && indexValue != -1) {
            while (j < b.length) {
                storeCounter++;
                if (storeCounter == k) {
                    indexValue = b[j];
                    break;
                }
                j++;
            }
        }
        /*for (int l = 0; l < arr.length; l++) {
            System.out.println(arr[l]);
        }*/
        return indexValue;
    }
}
