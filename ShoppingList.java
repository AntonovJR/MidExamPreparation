import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!"Go Shopping!".equals(input)) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Urgent":
                    if(!items.contains(command[1])){
                        items.add(0,command[1]);
                    }
                    break;
                case "Unnecessary":
                    items.remove(command[1]);
                    break;
                case "Correct":
                    if(items.contains(command[1])){
                        int index = items.indexOf(command[1]);
                        items.remove(index);
                        items.add(index,command[2]);
                    }
                    break;
                case "Rearrange":
                    if(items.contains(command[1])){
                        items.remove(command[1]);
                        items.add(command[1]);

                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ",items));
    }
}
