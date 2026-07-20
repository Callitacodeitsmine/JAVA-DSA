public class Factorial_of_Number_use_recursion {

    public static void main(String[] args) {

        System.out.println(call_sum(5));
    }

    public static int call_sum(int start){
        if(start == 0){
            return 1;
        }

        return start * call_sum(start - 1);
    }
}