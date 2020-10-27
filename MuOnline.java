import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        int initialHealth = 100;
        int initialBitcoins = 0;
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\|");
        String whatKillMe = "";

        for (int i = 0; i < input.length; i++) {
            String[] command = input[i].split(" ");
            switch (command[0]) {

                case "potion":
                    if(initialHealth+Integer.parseInt(command[1])>100){
                        command[1] = String.valueOf(100-initialHealth);
                        initialHealth=100;

                    }else {
                        initialHealth += Integer.parseInt(command[1]);
                    }
                    System.out.printf("You healed for %d hp.%n", Integer.parseInt(command[1]));
                    System.out.printf("Current health: %d hp.%n", initialHealth);
                    break;
                case "chest":
                    initialBitcoins += Integer.parseInt(command[1]);
                    System.out.printf("You found %d bitcoins.%n", Integer.parseInt(command[1]));
                    break;
                default:
                    initialHealth -= Integer.parseInt(command[1]);
                    whatKillMe = command[0];
                    if (initialHealth <= 0) {
                        System.out.printf("You died! Killed by %s.%nBest room: %d", whatKillMe, i+1);
                        return;
                    }
                    System.out.printf("You slayed %s.%n", command[0]);

                    break;
            }


        }
        System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d", initialBitcoins, initialHealth);
    }
}
