import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1 {
    public static void main(String[] args) {
        String input = "abcd2023111111102023";

        String regex = ".*2023.*";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            String result = input.replace("2023", "happynewyear");
            System.out.println("received chain: " + result);
        } else {
            System.out.println("The received chain, does not coincide with the specify patron.");
        }
    }
}

