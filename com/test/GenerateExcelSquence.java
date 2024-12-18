package com.test;

public class GenerateExcelSquence {
    public static void main(String[] args) {
        getName(29);
    }

    public static void getName(int no){

        int digit=0;
        if(no <26 && no >0){
            System.out.print(getAlphabateName(digit));
        }
        while(no >26){
            digit = no/26;
            System.out.print(getAlphabateName(digit));
            no = no%26;
            if(no <26){
                System.out.print(getAlphabateName(no));
            }
        }


    }
    static String getAlphabateName(int digit){
        char a =0;
        return ""+(a+digit);
    }
}
