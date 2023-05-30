package gr.aueb.cf.testbed7;

/**
 * This app encodes each character of
 * a String into the next ASCII-character.
 * It is implemented with two methods.
 *
 * @author Thanasis Chousiadas
 */
public class EncodeApp {

    public static void main(String[] args) {
        String s = "** Coding Factory! Hello World! **";
        String encodedStr;
        StringBuilder encodedSb;

        encodedStr = encoding(s);
        encodedSb = encodingSB(s);

        System.out.println(encodedStr);
        System.out.println("Using StringBuilder");
        System.out.println(encodedSb);
    }

    /**
     * This method encodes a String with each character
     * replaced the next in ASCII encoding.
     * @param s     the given String.
     * @return      the encoded String.
     */
    public static String encoding(String s) {
        if (s == null) return null;

        char[] chArr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            chArr[i] = (char) (s.charAt(i) + 1);
        }

        return String.valueOf(chArr);
    }

    /**
     * This method uses StringBuilder for encoding a String.
     * @param s         the given String.
     * @return          a StringBuilder with the encoded content.
     */
    public static StringBuilder encodingSB(String s) {
        if (s == null) return null;

        StringBuilder encodedSb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            encodedSb.append((char)(ch + 1));
        }

        return encodedSb;
    }
}
