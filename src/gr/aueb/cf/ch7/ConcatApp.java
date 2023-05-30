package gr.aueb.cf.ch7;

/**
 * Concatenates two or more strings.
 */
public class ConcatApp {

    public static void main(String[] args) {
        String title = "Mr. ";
        String firstname = "Thanasis ";
        String lastname = "Chousiadas";
        String fullname;
        String titledFullname;

        //overloading operator +
        fullname = firstname + lastname;
        titledFullname = title.concat(firstname).concat(lastname);
        System.out.println(fullname);
        System.out.println(titledFullname);
    }
}
