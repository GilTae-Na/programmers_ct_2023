package com.ll.level0.P120910;

public class Main {
}

class Solution {
    public int solution(int n, int t) {
        for(int i=1 ; i<=t ; i++){
            n *= 2;
        }
        return n;
    }
}