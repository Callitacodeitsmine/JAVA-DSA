public class GCD_of_two_numbers {
    public static void main(String[] args) {
        int gcd = 1;
        int num = 20;
        int num1 = 15;
        int maxi = Math.max(num, num1);

        for(int i=1; i<=maxi; i++){
            if(num%i == 0 && num1%i == 0){
                    gcd = i;
            }
        }
         System.out.println(gcd);
    }   
}