package gr.aueb.cf.ch2;

public class IntPrintApp {
    public static void main(String[] args) {
        int i = 11;

//        System.out.print(i + "\n");
//        System.out.println(i);
//        System.out.printf("%d%n", i);
//
//        System.out.print("i = " + i + "%n");
//        System.out.println("i = " + i);
//        System.out.printf("i = %d", i);

        System.out.printf("%4d%n", i);
        System.out.printf("%04d%n", i);
        System.out.printf("%05d%n", i);
        System.out.printf("%010d%n", i);
    }
}
