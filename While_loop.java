/*Factorial*/

import java.util.*;

public class While_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Select range of alphabet till Z: ");
        char alp = sc.next().charAt(0);
        
        System.out.print("Select number for factorial: ");
        int inp = sc.nextInt();

        while (alp <= 'Z'){
            System.out.print(alp+",");
            alp++;
        }
        System.out.println("");

        while (inp > 0) {
            System.out.print(inp + "*");
            inp--;
        }
            
        sc.close();
    }
}
