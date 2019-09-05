package com.nk.string.intern;

public class StringInternExample
{
    public static void main(String[] args)
    {
        String s1 = "ABC";

        String s2 = "XYZ";

        String s3 = "ABCXYZ";

        String s4 = s1 + s2;

        String s5 = (s1 + s2).intern();

        System.out.println("Is Constant and Concat same:" + (s3 == s4));
        System.out.println("Is Constant and intern same:" + (s3 == s5));
        System.out.println("Is Intern and Concat same:" + (s3 == s5));
        System.out.println("Is Concat same:" + (s3 == s4));
    }
}
