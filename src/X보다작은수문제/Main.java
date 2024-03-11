package X보다작은수문제;

/*
정수 N개로 이뤄진 배열 A와 정수 X가 주어진다.
이때 A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오

첫 째 줄에 N과 X가 주어진다. 1<=N<=10000,  X <=10000
둘 째줄에 수열 A를 이루는 정수 N개가 주어진다.

출력
X 보다 작은 수를 입력받은 순ㄴ서대로 공백으로 구분하여 출력
X 보다 작은 수는적어도 하나 존재
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt(); // 수를 입력 받은 배열 수
        int x = sc.nextInt(); // 조건 비교를 위한 수 (x 미만의 수 출력 )
        int[] arr = new int[n]; // 입력 받은 배열 수
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // 배열의 크기 만큼 임의의 값 입력
            if(arr[i] < x) System.out.println(arr[i]+ "");

        }

    }
}
