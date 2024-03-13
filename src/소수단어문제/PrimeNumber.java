package 소수단어문제;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int sum =0; // 각 알파벳의 총 숫자의 합을 구하는 변수
        boolean isPrime = true; // 기본값을 소수로 정의
        // 영어 단어를 입력 받기
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        // 각 영어 단어에서 주어진 수를 누적 (a=1, A=27)
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'a') sum += word.charAt(i) - 'a' + 1;
            else sum += word.charAt(i) - 'A' + 27;
        }
        for(int i =2; i<sum; i++) {// 1과 자기자신을 제외하고 반복문 순회
            if(sum % i == 0) isPrime = false;
        }
        if(isPrime) System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word.");
    }
}
