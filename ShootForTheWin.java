import java.util.Arrays;
import java.util.Scanner;


public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] targets = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();
        int counter = 0;
        while (!"End".equals(input)) {
            int index = Integer.parseInt(input);
            if (index <= targets.length-1 && targets[index] >= 0) {
                int currentNum = targets[index];
                targets[index] = -1;
                counter++;
                for (int i = 0; i < targets.length; i++) {
                    if (targets[i] > currentNum && targets[i] != -1) {
                        targets[i] -= currentNum;

                    } else if (targets[i] <= currentNum && targets[i] != -1) {
                        targets[i] += currentNum;

                    }
                }


            }
            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d ->",counter);
        for (int element: targets) {
            System.out.print(" "+element);
        }



    }

}

