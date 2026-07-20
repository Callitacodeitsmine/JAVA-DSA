public class Check_if_a_number_is_prime {
    public static void main(String[] args) {
        int num = 57;
        int cnt = 0;
        for(int i = 1; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                cnt++;
                if (num/i != i) {
                    cnt++;
                }
            }
        }
        if (cnt == 2) {
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}
