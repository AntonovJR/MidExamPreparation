import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = Integer.parseInt(scanner.nextLine());
        int wonBattles = 0;
        String input = scanner.nextLine();
        while (!"End of battle".equals(input)) {
            int distance = Integer.parseInt(input);
            if (health - distance >= 0) {
                health -= distance;
                wonBattles++;
                if (wonBattles % 3 == 0) {
                    health += wonBattles;
                }
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattles, health);
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", wonBattles, health);
    }
}
