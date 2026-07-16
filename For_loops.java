import java.util.*;

public class For_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Select Range : ");
        int k = sc.nextInt();
        System.out.println("\n"+"List of even numbers from the range of 0 to "+k);
        for(int i=0; i<=k; i++){
            if (i%2 == 0) {
                System.out.print(i+",");
            }
            else{
                System.out.print("");
            }
        }
        System.out.println();
        System.out.println('\n'+"List of odd numbers from the range of 0 to "+k);

        for(int i=0; i<=k; i++){
            if (i%2 != 0) {
                System.out.print(i+",");
            }
            else{
                System.out.print("");
            }
        }
        sc.close();
    }
}
