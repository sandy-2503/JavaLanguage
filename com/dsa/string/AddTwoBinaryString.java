package com.dsa.string;

public class AddTwoBinaryString {
    public static void main(String[] args) {
        String s1="00101";
        String s2 ="0";
        if(s1.length()>s2.length()){
            int l = s1.length()-s2.length();
            for (int i = 0; i < l; i++) {
                s2="0"+s2;
            }
        }
        if(s1.length()<s2.length()){
            int l = s2.length()-s1.length();
            for (int i = 0; i < l; i++) {
                s1="0"+s1;
            }
        }
        String result ="";
        char carryResult='0'; //10100
        for (int i = s1.length()-1; i >= 0 ; i--) {
            if(s1.charAt(i) == '1' && s2.charAt(i) == '1'){
                if(carryResult == '1'){
                    result ="1"+result;
                }else{
                    result ="0"+result;
                }
                carryResult='1';
            }else if((s1.charAt(i) == '1' && s2.charAt(i) == '0') || (s1.charAt(i) == '0' && s2.charAt(i) == '1')){
                if(carryResult == '1'){
                    result ="0"+result;
                    carryResult='1';
                }else{
                    result ="1"+result;
                    carryResult='0';
                }
            }else if(s1.charAt(i) == '0' && s2.charAt(i) == '0'){
                if(carryResult == '1'){
                    result ="1"+result;
                    carryResult='0';
                }else{
                    result ="0"+result;
                    carryResult='0';
                }
            }
        }
        if(carryResult == '1'){
            result ="1"+result;
        }
        System.out.println("Result "+result);
        for (int i = 0; i < result.length(); i++) {
            if(result.charAt(i) == '1'){
                break;
            }else if(result.charAt(i) == '0'){
                result = result.substring(1,result.length());
                i--;
            }
        }
        System.out.println("result : "+result);
    }
}
