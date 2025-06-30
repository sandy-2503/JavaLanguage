package com.test;


import java.util.HashMap;
import java.util.Map;

public class Temp {

    public static void main(String[] args) {
    String S = "><^v";
    int count = solution(S);
    System.out.println(count);

        String S1 = "abbaa";
        int N = S1.length();
        System.out.print(subString(S1, N));
    }


    public static  int solution(String S) {
        // Implement your solution here
        int []positoin = new int[S.length()+1];
        int count=0;
        for (int i = 0; i < positoin.length; i++) {
            positoin[i]=1;
        }

        positoin[0]=0;
        positoin[S.length()]=0;
        for (int i = 0; i < positoin.length; i++) {
            System.out.println("position = "+positoin[i]);
        }
        for(int i=1;i<positoin.length-1;i++){
            switch(S.charAt(i-1)){
                case  '<':
                    if(positoin[i-1] == 0){
                        positoin[i-1] =1;
                        positoin[i]=0;
                        count++;
                    }
                    if(positoin[i-1] == 1){

                    }
                    break;
                case '>' :
                    if(positoin[i+1] == 0){
                        positoin[i] =0;
                        positoin[i+1]=1;
                        count++;
                    }
                    break;
                case '^' :
                    positoin[i] =0;
                    count++;
                    break;
                case 'v' :
                    positoin[i] =0;
                    count++;
                    break;

            }
        }
        return count;
    }

    public int solution1(int[] A) {
        // Implement your solution here
        int res = 0;
        for(int i=0;i<A.length;){
            int j=i;
            for(;i<A.length && (A[i] == A[j]); ++i);
            {
                res +=Math.min(Math.abs(A[j] -(i-j)), i-j);
            }
        }
        return res;
    }

    static int subString(String S, int n){

        Map<Integer, Integer> hash = new HashMap<>();
        hash.put(0, 1);
        int pre = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            pre ^= (1 << (int)(S.charAt(i) - 97));
            count += hash.getOrDefault(pre, 0);
            hash.put(pre, hash.getOrDefault(pre, 0) + 1);
        }
        return count;
    }

}
