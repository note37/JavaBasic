package 과일이름정렬;

import java.util.Scanner;
import java.util.*;

/*
배열 갯수 입력 받음  >> 배열 갯수 입력, 배열 생성
배열 길이 만큼 랜덤수 생성해서 배열에 추가 >> 배열 길이 측정, 측정한 수만큼 랜덤 숫자 생성, 배열에 추가
임의의 수 입력 받아 배열내에 해당값 존재 확인 >> 수 입력 > 해당 값 확인
존재하지 않으면 음수 출력
 */
public class PracticeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 크기를 입력하세요.");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("찾을 숫자를 입력하세요.");
        int key =sc.nextInt(); // 검색할 키 값
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random()*num)+1);

        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("숫자 위치는 : "+Arrays.binarySearch(arr,key));
        }
}

