package com.dsa.string;

public class AddTwoBinaryString {
    public static void main(String[] args) {
        String a ="0";
        String b ="0";
        /*if(a.equals("0") && b.equals("0")){
            return "0";
        }*/
        if(a.length()> b.length()){
            int l = a.length()- b.length();
            for (int i = 0; i < l; i++) {
                b ="0"+ b;
            }
        }
        if(a.length()< b.length()){
            int l = b.length()- a.length();
            for (int i = 0; i < l; i++) {
                a ="0"+ a;
            }
        }
        String result ="";
        char carryResult='0'; //10100
        for (int i = a.length()-1; i >= 0 ; i--) {
            if(a.charAt(i) == '1' && b.charAt(i) == '1'){
                if(carryResult == '1'){
                    result ="1"+result;
                }else{
                    result ="0"+result;
                }
                carryResult='1';
            }else if((a.charAt(i) == '1' && b.charAt(i) == '0') || (a.charAt(i) == '0' && b.charAt(i) == '1')){
                if(carryResult == '1'){
                    result ="0"+result;
                    carryResult='1';
                }else{
                    result ="1"+result;
                    carryResult='0';
                }
            }else if(a.charAt(i) == '0' && b.charAt(i) == '0'){
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
