import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part2 {
    public static void main(String[] args) {
        File file = new File("theText.txt");

        try {
            Scanner scanner = new Scanner(file);
            StringBuilder numbers = new StringBuilder();

            Pattern pattern = Pattern.compile("\\b\\d+\\b");

            while (scanner.hasNext()) {
                String linea = scanner.nextLine();
                Matcher matcher = pattern.matcher(linea);

                while (matcher.find()) {
                    int number = Integer.parseInt(matcher.group());
                    if (number >= 0) {
                        numbers.append(number).append(",");
                    }
                }
            }

            scanner.close();

            if (numbers.length() > 0) {
                numbers.deleteCharAt(numbers.length() - 1);
                System.out.println("Found numbers: " + numbers.toString());
            } else {
                System.out.println("it is not possible to find integer no negative numbers at the fail.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("The fail does not exist...");
        }
    }
}
