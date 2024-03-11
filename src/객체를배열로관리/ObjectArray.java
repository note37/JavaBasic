package 객체를배열로관리;

// 개체를 배열로 관리는 배열의 각 요소가 기본 타입이 아니고 객체임을 의미

import java.util.Scanner;

public class ObjectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 인원 : ");
        int cnt = sc.nextInt();
        NameCard[] nameCards = new NameCard[cnt]; // NameCard클래스 타입의 배열 선언
        System.out.println("정보 입력 :");
        System.out.println("-------------------------------");
        for (int i = 0; i < nameCards.length; i++) {
            nameCards[i] = new NameCard();
            System.out.print("이름");
            nameCards[i].setName(sc.next());
            System.out.println("나이 : ");
            nameCards[i].setAge(sc.nextInt());
            System.out.print("이메일 : ");
            nameCards[i].setMail(sc.next());
            System.out.print("연락처 : ");
           nameCards[i].setPhoneNumber(sc.next());
        }
        for (NameCard e : nameCards) e.printInfo();
    }
}
