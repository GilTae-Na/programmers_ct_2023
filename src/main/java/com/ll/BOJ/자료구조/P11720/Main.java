package com.ll.BOJ.자료구조.P11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇개?");
        int N = sc.nextInt();
        sc.nextLine();
        System.out.println("수입력");
        String num = sc.nextLine();

        int sum = 0;
        char[] a = num.toCharArray();
        for(char b: a){
            sum += Character.getNumericValue(b);
        }
        System.out.println(sum);
    }
}