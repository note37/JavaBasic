package 소수단어문제;

import java.util.Scanner;
// 못품
/*
a=1 ~ z=26
A=37 ~ Z=52
 */
public class SoSu {
    public static void main(String[] args) {
        String[] lowerABC = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String lowerabc = "abcdefghijklmnopqrstuvwxyz";
        Scanner sc = new Scanner(System.in);
        System.out.println("글자를 입력하시오");
        String input = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (input.charAt(i) == lowerabc.charAt(j)) {
                    sum += lowerabc.charAt(j)+1;
                }
            }

        }
        System.out.println(sum);
    }
}


