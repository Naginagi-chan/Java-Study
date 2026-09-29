class BankAccount {
    String owner;
    int balance;
    static double interestRate = 0.03;

    BankAccount(String owner){
        this(owner, 0);
    }

    BankAccount(String owner, int balance)
    {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(int amount)
    {
        this.balance += amount;
        System.out.println("[" + amount + "]원이 입금되었습니다.");
    }
    void deposit(double amount)
    {
        deposit((int) amount);
    }

    void withdraw(int amount)
    {
        if(this.balance >= amount){
            this.balance -= amount;
            System.out.println("[" + amount + "]원이 출금되었습니다.");
        }else
            System.out.println("잔액이 부족합니다.");
    }

    void applyInterest(){
        balance += (int) (balance * interestRate);

    }


    void showInfo()
    {
        System.out.println("예금주: ["+ this.owner + "], 잔액: ["+this.balance+"]원");
    }
}




public class Tesort {
    public static void main(String[] args) {
        // 1. 객체 생성 (각각 다른 생성자 사용)
        BankAccount acc1 = new BankAccount("김철수", 10000);
        BankAccount acc2 = new BankAccount("이영희"); // 잔액 0원

        // 2. 입출금 테스트 (오버로딩 및 잔액 부족 확인)
        acc1.deposit(5000);         // 5000원 입금
        acc1.withdraw(20000);       // 잔액 부족 테스트
        acc2.deposit(3000.5);       // 실수 입금 테스트 (3000원 처리)

        System.out.println("--- 이자율 변경 전 상태 ---");
        acc1.showInfo();
        acc2.showInfo();

        // 3. static 이자율 일괄 변경 (3% -> 5%)
        BankAccount.interestRate = 0.05;

        // 4. 이자 적용
        acc1.applyInterest();
        acc2.applyInterest();

        System.out.println("--- 이자 적용 후 상태 ---");
        acc1.showInfo();
        acc2.showInfo();
    }
}