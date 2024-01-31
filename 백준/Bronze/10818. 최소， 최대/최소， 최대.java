import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); 

        String[] inputNumbers = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (String inputNumber : inputNumbers) {
            numbers.add(Integer.parseInt(inputNumber));
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        List<Integer> answerList = new ArrayList<>();

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        answerList.add(min);
        answerList.add(max);


        StringJoiner result = new StringJoiner(" ");
        for (int num : answerList) {
            result.add(Integer.toString(num));
        }

        System.out.println(result.toString());
    }
}
