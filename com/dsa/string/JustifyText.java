package com.dsa.string;

import java.util.ArrayList;
import java.util.List;

public class JustifyText {
    public static void main(String[] args) {
        String []arr = {"GfG", "is", "the", "best",
                "computer", "science", "portal", "for", "geeks." };
        int W = 16;
        List<String> ans = fullJustify(arr, W);
        for (String line : ans)
            System.out.println(line);
    }
    static public List<String> fullJustify(String[] words, int maxWidth) {
        int start = 0;
        List<String> justifiedText = new ArrayList<>();
        int len =0;
        StringBuilder str = new StringBuilder();
        while (start < words.length) {
            len = len+words[start].length();
            if(len>maxWidth){
                if(str.length() > 0) {
                    str.append("\n");
                }
                justifiedText.add(str.toString());
                str = new StringBuilder();
                len=0;

            }
            if(str.length() > 0) {
                str.append(" ");
            }
            str.append(words[start]);
            start++;
        }
        return justifiedText;
    }


    static int countCharacters(int start, int end,
                               List<String> arr) {
        int cnt = 0;
        for (int i = start; i <= end; i++)
            cnt += arr.get(i).length();
        return cnt;
    }
}
