package HashMap실전예제;
// 안됨 다시 할 것
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuMain {
    static Map<String, MenuInfo> map = new HashMap<>();

    public static void main(String[] args) {
        selectMenu();
        makeMenu();

    }
    // 초기메뉴 추가하기
    static void makeMenu(){ // static 전역 변수??
        map.put("Americano",new MenuInfo("Americani",2000,"Coffe","기본커피"));
        map.put("Espresso", new MenuInfo("Espresso",2500,"Coffee","진한커피"));
        map.put("Latte", new MenuInfo("Latte", 4000,"Coffee","우유포함"));
    }
    static void selectMenu(){
        Scanner sc = new Scanner(System.in);
        String key;
        while (true) {
            System.out.println("메뉴를 선택 하세요");
            System.out.println("[1]보기 [2]조회 [3]추가 [4]삭제 [5]수정 [6]종료 : ");
            int selMenu = sc.nextInt();
            switch (selMenu) {
                case 1:
                    System.out.println("==== 메뉴 보기 ====");
                    for(String e : map.keySet()) {
                        System.out.println("메뉴 : "+ map.get(e).name);
                        System.out.println("가격 : "+ map.get(e).price);
                        System.out.println("분류 : "+ map.get(e).category);
                        System.out.println("설명 : "+ map.get(e).spec);
                        System.out.println("====================");
                    }
                    break;
                case 2:
                    System.out.println("조회 할 메뉴를 입력 : ");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        System.out.println("메뉴 : "+ map.get(key).name);
                        System.out.println("가격 : "+ map.get(key).price);
                        System.out.println("분류 : "+ map.get(key).category);
                        System.out.println("설명 : "+ map.get(key).spec);
                    } else System.out.println("해당 메뉴가 존재하지 않습니다.");
                    break;
                case 3:
                    System.out.println("추가 할 메뉴를 입력 :");
                    key = sc.next();
                    if(map.containsKey(key)){
                        System.out.println("해당 메뉴가 이미 존재 합니다.");
                    } else {
                        System.out.println("가격 입력 :");
                        int price = sc.nextInt();
                        System.out.print("카테고리 입력 : ");
                        String cate = sc.next();
                        sc.nextLine(); /////////////// 버퍼 비우기
                        System.out.println("설명 입력 : ");
                        String spec = sc.next();
                        map.put(key, new MenuInfo(key, price, cate, spec));
                    }
                    break;
                case 4:
                    System.out.println("삭제할 메뉴를 입력 :");
                    key = sc.next();
                    if(map.containsKey(key)){
                        map.remove(key);
                        System.out.println(key + "메뉴를 삭제 했습니다.");
                    } else {
                        System.out.println("삭제 할 메뉴가 없습니다.");
                    }

                case 5:
                    System.out.println("수정 할 메뉴 입력 : ");
                    key = sc.next();
                    if(map.containsKey(key)){
                        System.out.println("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("카테고리 입력 : ");
                        String cate = sc.next();
                        System.out.print("설명 입력 : ");
                        String spec = sc.nextLine();
                        map.replace(key,new MenuInfo(key, price, cate, spec));
                    }
                    else System.out.println("수정 할 메뉴가 없습니다.");


                    case 6:
                    System.out.println("메뉴를 종료 합니다.");
                    return; // break 사용하면 반복문을 벗어나지 못함..

            }
        }
    }
}
