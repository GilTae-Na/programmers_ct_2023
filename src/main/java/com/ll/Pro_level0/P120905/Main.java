package com.ll.Pro_level0.P120905;

import java.util.Arrays;

public class Main {
}
class Solution {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(e-> e%n==0).toArray();
    }
}