/* Voteing Age */

import java.util.Scanner;

public class If_ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age>=18 && 100>=age){
            System.out.println("Vote");
        }
        else{
            System.out.println("No Vote");
        }
        sc.close();
    }
}