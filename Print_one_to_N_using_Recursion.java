public class Print_one_to_N_using_Recursion {
    public static void main(String[] args) {
        one_to_N(1,4);
    }

    public static void one_to_N(int current, int n){
        if(current > n){
            return;
        }

        System.out.println(current+", ");
        one_to_N(current+1, n);
    }
}