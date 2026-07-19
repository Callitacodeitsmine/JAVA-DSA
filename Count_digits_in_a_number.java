import java.util.Scanner;

public class Count_digits_in_a_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count digits in a number: ");
        int t = sc.nextInt();
        CDN(t);
        sc.close();
    }

    public static void CDN(int t){
        int a = 10;
        int i = 0;

        for( i=0; i<t; i++) {
        int k = t%a;
            if(k == t){
                break;
            }
            a = a * 10;
        }
        System.out.print("Number of digits present: ");
        System.out.println(i+1);
    }
}