package com.rimpackage;

import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(encrypt(s));
    }

    static String encrypt(String s) {
        int len = s.length(), i;
        String str="";

        for(i = 0; i<len;i++)
        {
            str = s.charAt(i) + str;
        }

        String s2 = "";
        for(i = 0; i<len; i++)
        {
            if(i%2==0)
            {
                s2 = s2 + (char)((int)(str.charAt(i))+1);
            }
            else
            {
                s2 = s2 + (char)((int)(str.charAt(i))-1);
            }
        }
        return s2;
    }
}
