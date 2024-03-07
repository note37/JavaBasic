package 단어공부문제;

import java.util.Scanner;

/*

단어 입력
출력단
첫째줄에 가장많이 사용된 알파벳을 대문자로 출력
가낭 많이 사용된 알파벳 두개 이상은 ? 출력

알파벳 배열 생성 a부터 z까지
카운트 배열 생성
 */
public class WordStudy {
    public static void main(String[] args) {

        int[] alphabet = new int[26]; // 알파벳 개수 만큼 배열 생성
        int max = 0; // 가장 많이 등장하는 단어의 수를 저장하는 변수
        char result = 0; // 가장 많이 등장한 단어를 저장
        Scanner sc = new Scanner((System.in));
        System.out.println("단어 입력: ");
        String word = sc.next(); // 스캐너로부터 단어를 입력 받음
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'a') alphabet[word.charAt(i) - 'a']++;
            else alphabet[word.charAt(i) - 'A']++;


        }
        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == max ) result = '?';
            else if(alphabet[i] > max) {
                max = alphabet[i];
                result = (char) ('A' +i);
            }
        }
        System.out.println();
    }
}
