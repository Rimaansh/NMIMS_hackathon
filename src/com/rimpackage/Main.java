package com.rimpackage;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //String s = in.nextLine();

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

    static String decrypt(String str) {
        int len = str.length(), i;
        String s2="", s="";

        for(i = 0; i<len; i++)
        {
            if(i%2!=0)
            {
                s2 = s2 + (char)((int)(str.charAt(i))+1);
            }
            else
            {
                s2 = s2 + (char)((int)(str.charAt(i))-1);
            }
        }

        for(i = 0; i<len;i++)
        {
            s = s2.charAt(i) + s;
        }
        return s;
    }
}
