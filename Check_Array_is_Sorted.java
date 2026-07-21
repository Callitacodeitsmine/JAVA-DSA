public class Check_Array_is_Sorted {
    public static void main(String[] args) {
        int a[] = {0,1,2,3,4,5,6,1};
        int count = 0;

        while (a[count] < a[a.length-1]) {
            count++;
        }

        if(count == a.length-1){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
}
