package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
         int n=obj.nextInt();
        int temp=0;
        while(n>0){
            int a=n%10;
            temp=(temp*10)+a;
            n=n/10;

        }System.out.println(temp);
       }
}















