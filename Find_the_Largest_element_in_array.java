import java.util.Arrays;

public class Find_the_Largest_element_in_array {
    public static void main(String[] args) {
        int a[] = {10,2,3,4,7,8,9,5};

        Arrays.sort(a);

        System.out.println(a[a.length-1]);
    }
}