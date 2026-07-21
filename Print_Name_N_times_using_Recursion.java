import java.util.Scanner;

public class Print_Name_N_times_using_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print_name("Asish",0,n);
        sc.close();
    }

    public static void Print_name(String name, int count, int n){
        if (count == n) {
            return;
        }

        System.out.println(name);

        Print_name(name, count+1, n);
    }
}
