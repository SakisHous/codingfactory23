package gr.aueb.cf.ch4;

/**
 * It prints 10 stars in the first line
 *  9 stars in teh second etc.
 */
public class Stars10Desc {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            //for (int j = 10; j >= i; j--) {
            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
