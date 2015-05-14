package ru.kpfu.itsi.group403.abdullin.stack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scan = new Scanner(System.in);
        System.out.println("�������� ����������� ������.");
        System.out.println("������� �����:");
        String s = scan.nextLine();

        System.out.println(str(s));
        scan.close();

    }
    public static boolean str(String s){
        LinkedStack<Character> st = new LinkedStack<Character>();
        char [] array = s.toCharArray();


        for (int i = 0; i <array.length ; i++) {
            if((array[i]==')' ||(array[i]=='}' )||(array[i]==']' ))&& st.isEmpty()){
                return false;
            }
            if((array[i]=='(' ||(array[i]=='{' )||(array[i]=='[' ))&& st.isEmpty()){
                st.push(array[i]);
            }
            else if(array[i]==')' && st.peek().equals('(')){
                st.pop();
            }
            else if(array[i]=='(' || array[i]=='{' || array[i]=='['){
                st.push(array[i]);
            }
            else if(st.peek().equals('(') && (array[i]=='}' || array[i]==']')){
                return false;
            }
            else if(array[i]=='}' && st.peek().equals('{')){
                st.pop();
            }
            else if(st.peek().equals('{') && (array[i]==')' || array[i]==']')){
                return false;
            }

            else if(array[i]==']' && st.peek().equals('[')){
                st.pop();
            }
            else if(st.peek().equals('[') && (array[i]=='}' || array[i]==')')){
                return false;
            }

        }
        return true;
    }
}