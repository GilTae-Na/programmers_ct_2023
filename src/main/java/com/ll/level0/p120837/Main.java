package com.ll.level0.p120837;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int hp) {
       int general;
       int soldier;
       int worker;

       general = hp/5;
       hp %= 5;

       soldier = hp/3;
       hp %= 3;

       worker = hp;

       return general + soldier + worker;
    }

}