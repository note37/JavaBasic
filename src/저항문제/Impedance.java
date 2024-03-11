package 저항문제;

import java.util.Scanner;

/*
입력
첫째 줄에 색
둘째 줄에 색
셋째 줄에 색
출력
숫자
 */
public class Impedance {
    public static void main(String[] args) {
        String[] color = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        int firstIdx = 0, secondIdx = 0, thirdIdx = 0;
        Scanner sc = new Scanner(System.in);
        String firstColor = sc.nextLine();
        String secondColor = sc.nextLine();
        String thirdColor = sc.nextLine();
        for(int i = 0; i < 10; i++) {
            if(firstColor.equals(color[i])) firstIdx = i;
            if(secondColor.equals(color[i])) secondIdx = i;
            if(thirdColor.equals(color[i])) thirdIdx = i;
        }
        System.out.println((long)((firstIdx * 10) + secondIdx) * (long)(Math.pow(10, thirdIdx )));


    }
}
