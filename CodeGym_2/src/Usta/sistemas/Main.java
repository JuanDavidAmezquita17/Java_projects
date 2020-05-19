package Usta.sistemas;

public class Main {

    public static void main(String[] args) {
        String s1 = "This is a Windows path: ";
        String s2 = "\"C:\\Program Files\\Java\\jdk1.8.0_172\\bin\"";
        String s3 = "This is a Java string: ";
        String s4 = "\\\"C:\\\\Program Files\\\\Java\\\\jdk1.8.0_172\\\\bin\\\"";

        System.out.println(s1 + s2);
        System.out.println(s3 + s4);
    }
}
