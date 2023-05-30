package gr.aueb.cf.testbed7;

/**
 * This app decodes a String where
 * each character is replaced with previous
 * in ASCII encoding.
 *
 * @author Thanasis Chousiadas
 */
public class DecodeApp {

    public static void main(String[] args) {
        String s = "++!Dpejoh!Gbdupsz\"!Ifmmp!Xpsme\"!++";
        String decodedStr;
        StringBuilder decodedSb;

        decodedStr = decoding(s);
        decodedSb = decodingSB(s);

        System.out.println(decodedStr);
        System.out.println("Using StringBuilder");
        System.out.println(decodedSb);
    }

    /**
     * This method decodes a String with each character
     * replaced the previous in ASCII encoding.
     * @param s     the given String.
     * @return      the decoded String.
     */
    public static String decoding(String s) {
        if (s == null) return null;

        char[] chArr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            chArr[i] = (char) (s.charAt(i) - 1);
        }

        return String.valueOf(chArr);
    }

    /**
     * This method uses StringBuilder for decoding a String.
     * @param s         the given String.
     * @return          a StringBuilder with the decoded content.
     */
    public static StringBuilder decodingSB(String s) {
        if (s == null) return null;

        StringBuilder decodedSb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            decodedSb.append((char)(ch - 1));
        }

        return decodedSb;
    }
}
