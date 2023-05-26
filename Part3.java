import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part3 {
    public static void main(String[] args) {
        String text = "We have a text with some numbers: 9.99, 13.5, -9.75, -3.1";

        String regex = "[-+]?\\d+(\\.\\d+)?";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        List<Double> numbers = new ArrayList<>();

        while (matcher.find()) {
            String numberStr = matcher.group();
            double number = Double.parseDouble(numberStr);
            numbers.add(number);
        }

        System.out.println("Matrix of decimal numbers:");
        for (double number : numbers) {
            System.out.println(number);
        }

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        System.out.println("Suma of decimal numbers: " + sum);

        double max = Double.MIN_VALUE;
        int sequenceNumber = -1;
        for (int i = 0; i < numbers.size(); i++) {
            double number = numbers.get(i);
            if (number > max) {
                max = number;
                sequenceNumber = i + 1;
            }
        }
        System.out.println("Max Number: " + max);
        System.out.println("Sequence of the max number: " + sequenceNumber);

        String result = text.replaceAll(regex, "number");
        System.out.println("Chain: " + result);
    }
}

