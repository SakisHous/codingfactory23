package gr.aueb.cf.ch7;

public class ForStringApp {

    public static void main(String[] args) {
        String s = "Coding Factory";

        String subStr = s.substring(0, s.length() / 2);

        System.out.println(subStr);

        /*for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }

        System.out.println("\u2764");

        String s2 = "Java";

        for (char ch : s2.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println();
        int index = s.indexOf("o", 10);
        int idx = s.lastIndexOf("o");

        System.out.println(index);
        System.out.println(idx);

        if (s.startsWith("Coding")) System.out.println("Coding factory");*/


    }
}
