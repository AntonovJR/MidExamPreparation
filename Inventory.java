import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();



        while (!"Craft!".equals(input)) {

            String[] command = input.split(" - ");
            switch (command[0]) {
                case "Collect":
                    if (!items.contains(command[1])) {
                        items.add(command[1]);
                    }
                    break;
                case "Drop":
                   items.remove(command[1]);
                    break;

                case "Combine Items":
                    String [] oldNewItem=command[1].split(":");
                    if(items.contains(oldNewItem[0])){
                        items.add(((items.indexOf(oldNewItem[0]))+1),oldNewItem[1]);
                    }
                    break;
                case "Renew":
                    if (items.contains(command[1])) {
                        items.remove(command[1]);
                        items.add(command[1]);

                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", items));
    }
}
