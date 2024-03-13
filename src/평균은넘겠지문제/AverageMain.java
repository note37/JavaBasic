package 평균은넘겠지문제;

import java.util.Scanner;

/*
첫째줄에 테스트 횟수 입력
둘째 줄부터는 학생수 N, N명 점
각 줄의 평균 넘는 백분율 출력
=============
입력
5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91
==============
출력
40.000%
57.143%
33.333%
66.667%
55.556%
 */
public class AverageMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCnt = sc.nextInt(); // 총 테스트 케이스 수
        double[] result = new double[testCnt]; // 총 테스트 결과
        for (int i = 0; i < result.length; i++) {
            result[i] = overRate();
        }
        for(double e : result) System.out.printf("%.3f%%\n",e);
    }

    static double overRate() {
        Scanner sc = new Scanner(System.in);
        int total = 0; // 평균을구하기 위해서는 총점이 필요
        int overCnt = 0; //평균을 넘는 살람의 수
        int studentCnt = sc.nextInt();
        int[] score = new int[studentCnt];
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            total += score[i]; // 총점을 누적
        }
        double average = (double) total / studentCnt; // 명시적 형변환 묵시정형변환이 일어남
        for(int e : score) if (e > average)  overCnt++; // 평균을 넘는 사람의 수
        return (double) overCnt/ studentCnt;
    }

}

