package ru.kpfu.itis.group403.abdullin.divideandconquer;

import  java.util.Scanner;
public class Palyndrom {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter word consisting only small letters:");
        String s = scan.next();
        scan.close();
        System.out.print(isPalindrome(s));
    }


    public static boolean isPalindrome (String p, int start, int end){

        if(start > end){
            return  true;
        }
        if(p.charAt(start)== p.charAt(end)){
            return isPalindrome(p, start + 1, end - 1);
        }

        return false;

    }

    private static boolean isPalindrome(String a){
        return isPalindrome(a,0,a.length()-1);
    }
}
