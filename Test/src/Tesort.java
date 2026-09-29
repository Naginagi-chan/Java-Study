class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void cry() {
        System.out.println(name + "이(가) 소리를 냅니다.");
    }

}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    void cry() {
        System.out.println(name + "이(가) 멍멍! 짖습니다.");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void cry() {
        System.out.println(name + "이(가) 야옹~ 웁니다.");
    }


}

class Cow extends Animal {
    Cow(String name) {
        super(name);
    }

    @Override
    void cry() {
        System.out.println(name + "이(가) 음머어~ 웁니다.");
    }
}

public class Tesort {
    public static void main(String[] args) {
        // [다형성 핵심] 부모 타입(Animal) 배열 하나에 서로 다른 자식 객체들을 담음
        Animal[] farm = new Animal[3];
        farm[0] = new Dog("바둑이");
        farm[1] = new Cat("나비");
        farm[2] = new Cow("누렁이");

        // 반복문을 돌며 각 동물의 울음소리를 호출
        for (int i = 0; i < farm.length; i++) {
            farm[i].cry();
        }
    }
}