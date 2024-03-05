package 반복문연습문제1;

import java.util.Scanner;

// 양의 정수 n을 입력 받아 n * n 크기의 행렬을 출력 하는 프로그램 작성
// 이 때 행렬의 값은 1부터 시작하여 왼쪽에서 오른쪽, 위에서 아래 순서대로 채워 넣음.
// 정수 입력 : 4
//  1  2  3  4
//  5  6  7  8
//  9 10 11 12
// 13 14 15 16
//public class SquareEx {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수 입력 : ");
//        int n = sc.nextInt();
//        for(int i = 1; i <= n * n; i++) {
//            System.out.printf("%4d", i);
//            if(i % n == 0) System.out.println();
//        }
//    }
//}

// 입력 받은 수가 소수인지 아닌지 판별하기 (소수란? 1과 자기 자신 이외의 수로는 나누어 지지 않는 수를 의미)
// 정수 입력 :
// 소수 입니다. / 소수가 아닙니다.
// 10을 입력하면 10 미만의 소수의 합을 출력
public class SquareEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i < n; i++) sum += primeFunc(i);
        System.out.println(n + "미만의 소수의 합 : " + sum);

    }
    static int primeFunc(int n) {
        boolean isPrime = true;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) isPrime = false;
        }
        if (isPrime) return n;
        else return 0;
    }
}



