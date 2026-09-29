import java.util.Arrays;

class Character {
    String name;
    int hp;

    Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void attack() {
        System.out.println(name + "이(가) 기본 공격을 합니다.");
    }

    String getInfo() {
        return "이름: " + name + ", HP: " + hp;
    }
}

class Warrior extends Character {
    Warrior(String name, int hp) {
        super(name, hp);
    }

    @Override
    void attack() {
        System.out.println(name + "이(가) 대검으로 강하게 내리칩니다!");
    }
}

class Mage extends Character {
    int mp;

    Mage(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }

    @Override
    void attack() {
        System.out.println(name + "이(가) 파이어볼을 발사합니다!");
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", MP: " + mp;
    }
}

class Start {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("아서", 150);
        Mage mage = new Mage("멀린", 80, 100);

        System.out.println(warrior.getInfo());
        warrior.attack();

        System.out.println("----------------------------");

        System.out.println(mage.getInfo());
        mage.attack();
    }
}