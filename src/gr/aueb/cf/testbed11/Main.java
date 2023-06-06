package gr.aueb.cf.testbed11;

/**
 * Driver class for User and
 * UserCredential class
 *
 * @author Thanasis Chousiadas
 */
public class Main {

    public static void main(String[] args) {
        User user = new User(1, "Alice", "W.");
        UserCredentials creds = new UserCredentials(1, "aliceW", "@12345#");

        System.out.println(user.userToString());
        System.out.println(creds.userCredsToString());
        System.out.printf("{%d, %s, %s, %s, %s}", user.getId(), user.getFirstname(), user.getLastname(),
                            creds.getUsername(), creds.getPassword());
    }
}
