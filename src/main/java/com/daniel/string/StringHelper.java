package com.daniel.string;

public class StringHelper {

    public String swapLast2Chars(String str) {


        int length = str.length();

        char lastChar = str.charAt(length - 1);
        char secondLastChar = str.charAt(length - 2);
        String strMinusLast2Chars = str.substring(0, length - 2);


        if(length == 1) {
            return str;
        }
        else if(length > 1){
            return strMinusLast2Chars + lastChar + secondLastChar;
        }

        throw new RuntimeException("empty String");
    }
}
