package gr.aueb.cf.ch7;

public class CopyStringApp {

    public static void main(String[] args) {
        String s = "Coding Factory";
        String clone;
        clone = s;

        System.out.println("s identity hash code: " + System.identityHashCode(s));
        System.out.println("clone identity hash code: " + System.identityHashCode(clone));

        clone = "Clone";
        System.out.println("s identity hash code: " + System.identityHashCode(s));
        System.out.println("clone identity hash code: " + System.identityHashCode(clone));
    }
}
