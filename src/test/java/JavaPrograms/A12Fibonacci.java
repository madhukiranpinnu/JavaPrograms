package JavaPrograms;

public class A12Fibonacci {
    public static void main(String[] args) {
        int fib=6;
        int first=0;
        int second=1;
        int next;
        for(int i=0;i<fib;i++){
            next=first+second;
            first=second;
            second=next;
            System.out.println(next);
        }
    }
}
