package com.qa.leetcode;

public class PalindromeNumber_9 {

    public static boolean isPalindrome_while(int number) { //1234
        int reminder;
        int reverse = 0;
        int updatedNumber = number;
        if (updatedNumber >= 0) {
            while (updatedNumber != 0) {
                reminder = updatedNumber % 10;
                reverse = (reverse * 10) + reminder;
                updatedNumber = updatedNumber / 10;
            }
            if (reverse == number) {
                System.out.println(reverse);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //number = 121



    public static void isPalindrome_for(int number){
        int reminder;
        int reverse=0;
        int updatedNumber=0;

        for (;number!=0;){
            reminder=number%10;
            reverse=(reverse*10)+reminder;
            updatedNumber=updatedNumber/10;
        }

    }

    public static void main(String[] args) {
        boolean isPalindrome=isPalindrome_while(-121);
        System.out.println(isPalindrome);
    }
}
