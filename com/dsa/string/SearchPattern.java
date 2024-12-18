package com.dsa.string;

import java.util.*;

public class SearchPattern {
    public static void main(String[] args) {
        String pat = "wfn";
        String txt = "duxwfnfo";
        System.out.println(searchPattern(pat,txt));
    }
    public static ArrayList<Integer> searchPatternTimeExceeded(String pat, String txt) {
        ArrayList<Integer> ls = new ArrayList<>();
        String subStre = "";
        for (int i = 0; i < txt.length()-pat.length()+1; i++) {
            subStre = txt.substring(i,pat.length()+i);
            System.out.println("i= "+i+": pat="+(pat.length()+i)+", "+"subStre = "+subStre);
            if(pat.equals(subStre)){
                System.out.println("Index = "+i);
                ls.add(i);
            }
            subStre="";
        }
        return ls;
    }

    public static ArrayList<Integer> searchPattern(String pat, String txt) {
        ArrayList<Integer> ls = new ArrayList<>();
        String subStre = "",subStrRight="";
        int left=0,right=txt.length();
        for (int i = 0; i < txt.length()/2; i++) {
            subStre = txt.substring(i,pat.length()+i);
            subStrRight = txt.substring(right-pat.length(),right);
            System.out.println("i= "+i+": pat="+(pat.length()+i)+", "+"subStre = "+subStre);
            System.out.println("right= "+(right-pat.length())+": pat="+right+", "+"subStrRight = "+subStrRight);
            if(pat.equals(subStre)){
                ls.add(i);
            }
            if(pat.equals(subStrRight)){
                ls.add(right-pat.length());
            }
            right--;
            System.out.println("i="+(i+pat.length()+1)+", right"+right);
            if((i+pat.length()+1)>right){

                break;
            }
        }
        Collections.sort(ls);
        return ls;
    }
}
