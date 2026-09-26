class Tvs
{
    String color;
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class TvTest2 {
    void main() {
        Tvs t1 = new Tvs();
        Tvs t2 = new Tvs();
        System.out.println("t1 channel " + t1.channel + ".");
        System.out.println("t2 channel " + t2.channel + ".");

        t1.channel = 7;
        System.out.println("change t1 channel to 7");

        System.out.println("t1 channel " + t1.channel + ".");
        System.out.println("t2 channel " + t2.channel + ".");
    }
}