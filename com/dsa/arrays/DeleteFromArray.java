package com.dsa.arrays;

public class DeleteFromArray {
    public static  int deleteElement(int arr[],int n,int key){
        int keyIndex=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                keyIndex=i;
                break;
            }
        }
        System.out.println("keyIndex : "+keyIndex);
        for (int i = keyIndex; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }

        return arr.length-1;
    }
    public static void main(String args[])
    {
        int i;
        int arr[] = { 10, 50, 30, 40, 20 };

        int n = arr.length;
        int key = 30;

        System.out.println("Array before deletion");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        // Function call
        n = deleteElement(arr, n, key);

        System.out.println("\n\nArray after deletion");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println("Two Dimensional array");
        int twoArr[][] = {
                {2,4,2,5},
                {5,2,3}
        };

    }
}
