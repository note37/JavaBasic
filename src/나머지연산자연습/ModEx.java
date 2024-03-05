package 나머지연산자연습;

import java.util.Scanner;

// 100의 자리 정수를 입력 받아서 3개의 변수에 나눠 담기
// ex) 257 => a변수에 2, b변수에 5, c변수에 7
// 몫과 나머지를 구해서 만들어야 함
public class ModEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("100의 자리 정수를 입력 하세요 : ");
        int num = sc.nextInt();
        int a = num / 100; // 100으로 나눈 몫을 구함
        int b = (num % 100) / 10; // 100으로 나눈 나머지를 구하고, 다시 10으로 나눈 몫을 구함
        int c = num % 10; // 10으로 나눈 나머지를 구함
        if (a > b) {
            System.out.println(Math.max(a, c));
        } else {
            System.out.println(Math.max(b, c));
        }
    }
}
