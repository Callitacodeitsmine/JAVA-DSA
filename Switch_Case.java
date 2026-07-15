//Basic calaculation
import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Select First Intiger: ");
        int sum1 = sc.nextInt();
        System.out.print("Select First Intiger: ");
        int sum2 = sc.nextInt();
        System.out.println("Select From menu:"); 
        System.out.println("1-SUM ");
        System.out.println("2-DIFFERENCE");
        System.out.println("3-MULTIPLY");
        System.out.println("4-MAXIMUM FROM BOTH THE NUMBERS");
        System.out.println("5-MINIMUM FROM BOTH THE NUMBERS");
        System.out.print("Select == ");
        int Select = sc.nextInt();

        switch (Select) {
            case 1:
                System.out.println(sum1 + sum2);
                break;
            case 2:
                System.out.println(sum1 - sum2);
                break;
            case 3:
                System.out.println(sum1 * sum2);
                break;
            case 4:
                System.out.println(Math.max(sum1, sum2));
                break;
            case 5:
                System.out.println(Math.min(sum1, sum2));
                break;
            default:
                System.out.println("Select Correct value");
                break;
        }
        sc.close();
    }
}
