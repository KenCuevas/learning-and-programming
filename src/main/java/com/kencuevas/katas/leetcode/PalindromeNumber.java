package com.kencuevas.katas.leetcode;

/*
 * kata name: Palindrome number
 * Is difficult for me? Easy
 * Difficult in Leet code: Easy
 * Status: Done
 * Date: 29/01/2024
 */
public class PalindromeNumber {

    //Easy form using up-to-date methods
//    public boolean isPalindrome(int x){
//        StringBuilder number = new StringBuilder(String.valueOf(x));
// =       StringBuilder reverse = new StringBuilder(number).reverse();
//
//        if(number.compareTo(reverse) == 0){
//            return true;
//        }else{
//            return false;
//        }
//    }
    public boolean isPalindrome(int x){
        if (x < 0){
            return false;
        }
        int reversedNumber = 0;
        int temp = x;

        while (temp != 0){
            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
            temp /= 10;
        }
        return (reversedNumber == x);
    }
}
