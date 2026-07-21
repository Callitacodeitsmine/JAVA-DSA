public class Reverse_Array_use_Recursion {
    public static void main(String[] args) {
        int n[] = {1,2,3,4,5,6,7,8,9,10};
        int i = n.length-1;
        call_arr(n,i);
    }

    public static void call_arr(int n[], int i){
        if (i<=-1) {
            return;
        }
        System.out.print(n[i]+",");

        call_arr(n, i-1);
    }
}
