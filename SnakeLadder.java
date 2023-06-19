public class SnakeLadder {

    public static void main(String[] args) {
        System.out.println("WELCOME TO THE SNAKE & LADDER GAME");

    }

    int var0 = 0;
    int rollDie = 0;

    public static int rollDie() {
        int var0 = (int) (Math.random() * 6.0D + 1.0D);

        return var0;
    }

    public static int optionValue() {
        int var0 = (int) (Math.random() * 3.0D + 1.0D);
        return var0;
    }
}
