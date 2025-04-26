package src;

public class StaticBlock {
    // static block
    static {
        System.out.println("Static block is invoked");
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println("Hello main");
    }
}
