import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).sorted().collect(Collectors.toList());
        double sum = 0;
        int counter = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        double average = sum / numbers.size();
        for (int i = numbers.size() - 1; i > 0; i--)
            if (numbers.get(i) > average) {
                System.out.print(numbers.get(i) + " ");
                counter++;
                if (counter == 5) {
                    return;
                }
            }
        if(numbers.get(0)==average){
            System.out.println("No");
        }
    }
}
