public class Sum_N_Natural_Numbers_using_Recursion {

    public static void main(String[] args) {
        call_sum(6);
    }
        
        public static void call_sum(int start){
            int h = (start*(start + 1));
            int m = h/2;

            System.out.println(m);
        }
    }