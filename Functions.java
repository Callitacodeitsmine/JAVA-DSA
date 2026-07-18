/* Functions (Pass by Reference and Value) */

class Wrapper {
    int value = 5;
}

public class Functions {

    public static void Pass_by_Reference(Wrapper obj) {
        obj.value += 10;
    }

    public static void Pass_by_Value(int a){
        a = a + 20;
    }
    public static void main(String[] args) {
        int x = 5;
        Pass_by_Value(x);
        System.out.println(x);

        Wrapper w = new Wrapper();
        Pass_by_Reference(w);
        System.out.println(w.value);
    }   
}