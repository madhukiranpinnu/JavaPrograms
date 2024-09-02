package JavaPrograms;

public class A10Polindrome {
    public static void main(String[] args) {
        int i=12321;
        int rev=0;
        int mainHere=i;
        while (i>0){
            rev=rev*10+i%10;
            i=i/10;
        }
        if(mainHere==rev){
            System.out.println("Polindrome");
        }
        else {
            System.out.println("Not polindrome");
        }
    }
}
