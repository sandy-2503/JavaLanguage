package com.sandeep.exceptionex;

public class ExceptionEx1 {
    public static void main (String[] args)
    {

        // array of size 4.
        int[] arr = new int[4];
        try
        {
            int i = arr[4];

            // this statement will never execute
            // as exception is raised by above statement
            System.out.println("Inside try block");
        }
        catch(NullPointerException ex)
        {
            System.out.println("Exception has been caught");
        }
        finally {
            System.out.println("Error");
        }

        // rest program will be executed
        System.out.println("Outside try-catch clause");
    }
}
