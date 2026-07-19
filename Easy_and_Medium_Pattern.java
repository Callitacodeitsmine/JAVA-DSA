public class Easy_and_Medium_Pattern {
    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        pattern7();
    }

    public static void pattern1(){
        for(int i = 0; i<5; i++){
            for(int k=0; k<5; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(){
        for(int i = 0; i<5; i++){
            for(int k=0; k<i; k++){
                System.out.print("*");
        }
        System.out.println();
    }
    }

    public static void pattern3(){
        for(int i = 1; i<7; i++){
            for(int k = 1; k<i; k++){
                System.out.print(k);
            }
        System.out.println("");
        }
    }

    public static void pattern4(){
        for(int i = 0; i<6; i++){
            for(int k = 0; k<i; k++){
                System.out.print(i);
            }
        System.out.println("");
        }
    
    }

    public static void pattern5(){
        for(int i = 0; i<5; i++){
            for(int k = i; k<5; k++){
                System.out.print("*");
            }
        System.out.println("");
    }
}

 public static void pattern6(){
    int n = 6;
    for(int i=1; i<6; i++){
        for(int k=1; k<n; k++){
            System.out.print(k);
        }
        System.out.println();
        n--;
    }
 }

 public static void pattern7(){
    /*5, 456, 34567*/
    int a = 5;
    for(int i=1; i<=a; i++){
        for(int k=1; k<=a-i; k++){
            System.out.print(" ");
        }
        for(int j=1; j<=(2*i-1); j++){
            System.out.print("*");
        }
        System.out.println();
    }

 }
}