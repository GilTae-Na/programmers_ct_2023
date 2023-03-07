package com.ll.level0.p120906;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n) {
        String str = n + "";
        int sum = 0;

        for(int i=0 ;i <str.length(); i++){
            char c = str.charAt(i);
            sum += Character.getNumericValue(c);
        }

        return sum;
    }

    public int solution2(int n) {
        return (n + "")
                .chars()
                .map(e -> Character.getNumericValue(e))
                .sum();
    }
    public int solution3(int n) {
        return (n + "")
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }
}