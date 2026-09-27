class BlockTest {
    static {
        System.out.println("static { } ");
    }

    {
        System.out.println("{ }");
    }

    public BlockTest() {
        System.out.println("생성자");
    }

    static int[] arr = new int[10];

    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }

    void main() {
        System.out.println("BlockTest bt = new BlockTest (); ");
        BlockTest bt = new BlockTest();
        System.out.println("BlockTest bt2 = new BlockTest (); ");
        BlockTest bt2 = new BlockTest();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] :" + arr[i]);
        }
    }
}