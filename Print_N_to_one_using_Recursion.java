public class Print_N_to_one_using_Recursion {
    public static void main(String[] args) {
        N_to_one(4, 1);
    }

    public static void N_to_one(int n, int end) {
        if(n < end){
            return;
        }

        System.out.println(n+",");

        N_to_one(n-1, end);
    }
}