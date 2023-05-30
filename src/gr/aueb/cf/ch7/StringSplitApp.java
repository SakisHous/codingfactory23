package gr.aueb.cf.ch7;

public class StringSplitApp {

    public static void main(String[] args) {
        String s = "Athens       University of Athens and Business";

        String[] tokens = s.split(" +");    // για ένα ή περισσότερα κενά διαστήματα

        for (String token : tokens) {
            System.out.println(token);
        }
        
    }
}
