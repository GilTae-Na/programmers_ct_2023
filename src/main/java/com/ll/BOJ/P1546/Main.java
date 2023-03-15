package com.ll.BOJ.P1546;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        int max=0;
        for(int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }
        for(int i=0; i<n;i++){
            if(A[i]>max){max = A[i];}
        }
        int result = Arrays.stream(A).sum()*100/max/3;

        System.out.println(result);
    }
}
