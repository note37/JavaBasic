package 다중인터페이스;

public class MultipleInterface {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer;
        buyer.buy();
        buyer.order(); // 재정의 된 메서드 호출

        Sell seller = customer;
        seller.sell();
        seller.order();

        Customer costomer1 = (Customer) seller;
        costomer1.buy();
        costomer1.sell();
        costomer1.order();
    }
}
interface Sell {
    void sell();
    default void order(){
        System.out.println("판매 주문");
    }
}
interface Buy {
    void buy();
    default void order(){
        System.out.println("구매 주문");
    }
}
class Customer implements Buy, Sell {

    @Override
    public void sell() {
        System.out.println("고객이 판매주문");
    }

    @Override
    public void buy() {
        System.out.println("고객이 구매하기");
    }

    @Override
    public void order() {
        System.out.println("고객이 주문하기");
    }
}