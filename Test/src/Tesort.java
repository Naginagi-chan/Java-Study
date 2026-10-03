interface DiscountPolicy{
    int calculateDiscount(int price);
}

class FixDiscountPolicy implements DiscountPolicy{
    @Override
    public int calculateDiscount(int price){
        return 1000;
    }
}

class RateDiscountPolicy implements DiscountPolicy{
    @Override
    public int calculateDiscount(int price) {
        return (int)(price * 0.1);
    }
}



public class Tesort {
    public static void main(String[] args) {
        int itemPrice = 20000;

        // 1. 고정 할인 정책 장착
        DiscountPolicy fixPolicy = new FixDiscountPolicy();
        System.out.println("고정 할인 금액: " + fixPolicy.calculateDiscount(itemPrice) + "원");

        // 2. 10% 정률 할인 정책으로 부품 교체
        DiscountPolicy ratePolicy = new RateDiscountPolicy();
        System.out.println("정률 할인 금액: " + ratePolicy.calculateDiscount(itemPrice) + "원");
    }
}