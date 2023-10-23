package com.example.practice1;

import java.util.Scanner;

public class q10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;          // 총개수찾기
        int N = sc.nextInt();   // 정수의 갯수를 받는다.
        int[] arr = new int[N]; // 정수의 길이만큼의 배열을 생상;

        for(int i = 0; i < N; i++) {
            arr[i]=sc.nextInt();
        }
        int b = sc.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if(b == arr[j]){
                count++;
            }
        }
        System.out.println(count);
    }
}
//문제
//        총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
//
//        출력
//        첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
