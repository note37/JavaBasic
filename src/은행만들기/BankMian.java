package 은행만들기;

public class BankMian {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오", 1000);
        Bank shinhan = new Bank("신한",1000);
        Bank nh = new Bank("농협",0);

        kakao.setDeposit(3500);
        kakao.viewAccount();

        shinhan.setWithdraw(900);
        shinhan.viewAccount();

        nh.setWithdraw(100);
        nh.viewAccount();

        System.out.println(Bank.getCount());
    }
}
