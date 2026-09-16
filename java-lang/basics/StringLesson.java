package basics;

public class StringLesson {
    public static void main(String[] args) {
        String name = "Dagar";
        String s1 = "Mihir";
        String s2 = "Mihir";
        //String obj = new String("Mihir");

        System.out.println(s1 == s2); // true thus only one obj but two ref


        name = name + "Mihir"; // doesn't change the date, creates a new obj alltogether

        // String Buffer -> gives a buffer of 16 bytes

        StringBuffer sbuff = new StringBuffer("Mihir");
        System.out.println(sbuff.capacity());
        System.out.println(sbuff.length());

        sbuff.append("Dagar");
        System.out.println(sbuff);

        // toString() also available


    }
}
