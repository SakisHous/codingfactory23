package gr.aueb.cf.ch8;

public class NullPointerExceptApp {

    public static void main(String[] args) {
        String s = null;

        if (s != null)
            if (s.equals("coding")) {
                System.out.println("Bingo");
            } else {
                System.out.println("Not equals!");
            }
        else {
            System.out.println("Null");
        }
    }
}
