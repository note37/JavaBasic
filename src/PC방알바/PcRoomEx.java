package PC방알바;

import java.util.Scanner;

public class PcRoomEx {
    public static void main(String[] args) {
        // 100대의 PC 만들기
        int[] pcRoom = new int[100]; // heap영역에 공간이 확보 되고 0으로 자동 초기화
        Scanner sc = new Scanner(System.in);
        int cnt = 0; // 거절 횟수 누적
        int seatNum; // 고객이 예약하는 좌석
        // 예약 손님 수
        int number = sc.nextInt();
        for(int i = 0; i < number; i++) {
            seatNum = sc.nextInt(); // 예약 좌석 번호 입력 받기 (1 ~ 100)
            if(pcRoom[seatNum - 1] == 1) cnt++; // 값이 1이면 예약된 자리이므로 거절 횟수 누적
            else pcRoom[seatNum - 1] = 1; // 1은 좌석 예약을 의미
        }
        System.out.println(cnt);
    }
}
