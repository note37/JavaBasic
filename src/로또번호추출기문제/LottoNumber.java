package 로또번호추출기문제;

import java.util.Arrays;
/*
1. 반복문 조건문 중첩
2. 번호 추출 후 배열에 삽입
3. 번호 추출 후 배열에 이미 있으면 다시 번호 추출 (중복이 없을 때 까지)
4. 6개 번호 배열에 삽입 되면 배열 결과 출력

 */
public class LottoNumber {
    public static void main(String[] args) {
        int[] total = new int[6]; // 중복값을 허용하지 않기 위한배열 생성
        int number = 0; // 랜덤으로 생성된 로또 번호를 담을 변수
        int index =0; // 로또 번호를 담고 배열의 위치를 이동하기 위해 사용하는 인덱스
        boolean isExist = false; // 중복 여부를 체크

        while (true) { // 중복이 몇번 발생 할지 모르기 때문에 무한 반복
            number = (int)((Math.random()*45+1)); // 1~45 사이의 정수 값을 반환
            for (int i = 0; i < 6; i++) {
                if(total[i] == number) isExist=true;{ // 배열내에 번호가 있으면 true 반환

                }
            }
            if(!isExist) {
                total[index++] = number; // 중복되지 않은 번호를 배열에 넣고 인덱스를 증가
            }
            if(index==6) break; // 중복되지 않은 로또 번호가 6개 만들어 졌으므로 반복문 탈출
            isExist = false;
        }
        for(int e: total) System.out.print(e + " ");

    }
}
