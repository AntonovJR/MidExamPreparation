import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] tokens = input.split(" ");
            int index = Integer.parseInt(tokens[1]);
            int power = Integer.parseInt(tokens[2]);

            switch (tokens[0]) {
                case "Shoot":
                    if (numbersList.size() > index && index >= 0) {
                        numbersList.set(index, numbersList.get(index) - power);
                        if (numbersList.get(index) <= 0) {
                            numbersList.remove(index);
                        }
                    }
                    break;
                case "Add":
                    if (numbersList.size() > index && index >= 0) {
                        numbersList.add(index, power);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int leftRadius = Math.max(index - power, -1);
                    int rightRadius = Math.min(index + leftRadius, numbersList.size() - 1);
                    if (leftRadius >= 0 && rightRadius <= numbersList.size() - 1) {
                        numbersList.remove(index);
                        numbersList.subList(leftRadius, rightRadius - leftRadius + 1).clear();
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;


            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < numbersList.size(); i++) {
            if (i == numbersList.size() - 1) {
                System.out.println(numbersList.get(i));
            } else {
                System.out.print(numbersList.get(i) + "|");
            }

        }
    }
}
