import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum =0;
        while (!input.equals("regular") && !input.equals("special")) {
            double price = Double.parseDouble(input);
            if (price > 0) {
                sum += price;
            } else {
                System.out.println("Invalid price!");
            }

            input = scanner.nextLine();

        }
        if(sum==0){
            System.out.println("Invalid order!");
            return;
        }
        if(input.equals("regular")){
            System.out.printf("Congratulations you've just bought a new computer!%n" +
                    "Price without taxes: %.2f$%n" +
                    "Taxes: %.2f$%n" +
                    "-----------%n" +
                    "Total price: %.2f$",sum,(sum*1.2)-sum,sum*1.2);
        }else{
            System.out.printf("Congratulations you've just bought a new computer!%n" +
                    "Price without taxes: %.2f$%n" +
                    "Taxes: %.2f$%n" +
                    "-----------%n" +
                    "Total price: %.2f$",sum,(sum*1.2)-sum,sum*1.2*0.9);
        }
    }
}
