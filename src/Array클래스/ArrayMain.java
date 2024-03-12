package Array클래스;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

// 배열을 다루기 위한 다양한 메소드 포함
public class ArrayMain {
    public static void main(String[] args) {
        Integer[] arr = {5,3,4,7,8,9,2,1};
        Arrays.sort(arr); // 오름차순 정렬
        for(int e : arr) System.out.print(e+" ");
        System.out.println();
        System.out.println(Arrays.binarySearch(arr,5)); // 퀵정렬 방법인 바이너리서치 성능이 좋으나 배열이 정렬 되어 있어야 함 속도는 Olog(n)??
        Arrays.sort(arr, Collections.reverseOrder()); // arr이 int 기본 타입일 경우 Collection 클래스 사용불가하여 Integar 참조 타입 사용 해야함.
        for(int e : arr) System.out.print(e+" ");
        System.out.println();


    }
}
