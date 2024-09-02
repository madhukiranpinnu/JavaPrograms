package JavaPrograms;

import java.util.Scanner;

public class A15Even {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if(n%2==0){
            System.out.println("Prime");
        }
        else {
            System.out.println("Composite");
        }
    }
}
