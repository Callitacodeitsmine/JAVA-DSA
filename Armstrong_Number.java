public class Armstrong_Number {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int an, sum = 0;

        while (num>0) {
            an = num%10;
            sum = sum + an*an*an;
            num = num/10;
        }

        if(temp == sum){
            System.out.println("Its a Armstrong Number");
        }
        else{
            System.out.println("Its not a Armstrong Number");
        }
        System.out.println(sum);
    }
}