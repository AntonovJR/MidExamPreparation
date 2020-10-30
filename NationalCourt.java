import java.util.Scanner;

public class NationalCourt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());
        int sumEmployee = firstEmployee + secondEmployee + thirdEmployee;
        int people = Integer.parseInt(scanner.nextLine());
        int hours = 0;
        while (!(people<=0)){
            hours++;
            if(!(hours%4==0)) {
                people -= sumEmployee;
            }

        }
        System.out.printf("Time needed: %dh.",hours);
    }
}