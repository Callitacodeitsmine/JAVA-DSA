class reversenum{
    public int revnumber(int n){
        int revnum = 0;
        while (n > 0) {
            int last = n % 10;
            revnum = revnum * 10 + last;
            n = n / 10;
        }
        return revnum;
    }
}

public class Number_is_Palindrome {
    public static void main(String[] args) {
        int n = 12121;
        reversenum obj = new reversenum();
        if (obj.revnumber(n) == n){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not a Palindrome");
        }
    }
}