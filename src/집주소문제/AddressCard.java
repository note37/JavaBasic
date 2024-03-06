package 집주소문제;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
각 숫자사이 1cm 여백
처음 끝 1cm 여백
숫자 1 1cm 숫자 0 4cm 나머지 숫자는 3cm
 */
public class AddressCard {
    public static void main(String[] args) {
        int[] numSize = {4,2,3,3,3,3,3,3,3};
        List<Integer> rst = new ArrayList<>();
        int sum = 0; // 여백을 포함한 전체 길이
        Scanner sc = new Scanner(System.in);
        while (true) {
            String num = sc.nextLine(); // 공백을 만날때까지 문자열을 입력 받음
            if(num.equals("0")) break; // 입력값이 0이면 종료
            for(int i = 0; i <num.length(); i++) { //입력받은 문자열의 길이만큼 반복
                sum += numSize[num.charAt(i) - '0'] +1; //ASCII 코드값으로 정수값을 계산하고 값을 1을 더함

            }
            rst.add(sum +1); // 1을 더해주는 이유는 맨 앞의 여백 계산
            sum = 0;
        }
        for(int e : rst) System.out.println(e);
    }
}
