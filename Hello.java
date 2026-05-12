public class Hello {
    public static void main(String[] args) {
        byte b = 127;
        int a = 258;

        b = (byte) a;

        System.out.println(258 % 256);
        System.out.println(b);
    }
}
