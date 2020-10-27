import java.util.Scanner;

public class BonusScoringSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
       if(students>0) {
           Double[] grades = new Double[students];
           for (int i = 0; i < students; i++) {
               double input = Double.parseDouble(scanner.nextLine());
               grades[i] = input;

           }
           double max = grades[0];
           for (int j = 0; j < grades.length; j++) {

               if (grades[j] > max)
                   max = grades[j];
           }
           double total = Math.ceil((max / lectures) * (5 + additionalBonus));
           System.out.printf("Max Bonus: %.0f.", total);
           System.out.printf("%nThe student has attended %.0f lectures.", max);
       }else{
           System.out.printf("Max Bonus: 0.");
           System.out.printf("%nThe student has attended 0 lectures.");
       }
    }
}
