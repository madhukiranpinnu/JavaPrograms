package JavaPrograms;

public class A9NumberOfDigits {
    public static void main(String[] args) {
        int i=123;
        int digitCount=0;
        while (i>0){
            i=i/10;
            digitCount++;
        }
        System.out.println(digitCount);
    }
}
