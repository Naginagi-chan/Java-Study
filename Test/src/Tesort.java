abstract class Payment{
    int amount;

    Payment(int amount){
        this.amount = amount;
    }

    abstract void pay();
}

class KakaoPay extends Payment {
    KakaoPay(int amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("[카카오페이] " + amount + "원 간편 결제 완료");
    }
}

class NaverPay extends Payment {
    NaverPay(int amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("[네이버페이] " + amount + "원 간편 결제 완료");
    }
}

class CardPay extends Payment {
    CardPay(int amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("[신용카드] " + amount + "원 간편 결제 완료");
    }
}

class OrderService{
    void processPayment(Payment payment){
        payment.pay();
    }

}

public class Tesort {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        // 각각 다른 자식 객체 생성
        Payment kakao = new KakaoPay(15000);
        Payment naver = new NaverPay(23000);
        Payment card = new CardPay(50000);

        // 주문 처리기는 Payment 규격 하나로 전부 결제 진행
        orderService.processPayment(kakao);
        orderService.processPayment(naver);
        orderService.processPayment(card);
    }
}