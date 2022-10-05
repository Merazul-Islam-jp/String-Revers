import java.util.Scanner;

public class StringRevers_two {
    static Scanner user_input = new Scanner(System.in);

    public static void main(String[] args) {
        prln("Enter the String name:");
        String name = user_input.nextLine();
        revers(name);

    }

    static String revers(String s) {

        char[] ch = new char[s.length()];
        for (int i = s.length() - 1; i > 0; i--) {
            prln(s.charAt(i) + " ");
        }
        return s;
    }

    static void prln(Object object) {
        System.out.println(object);
    }

}
