package JavaPrograms;

public class A17Prime {
    public static void main(String[] args) {
        int n=13;
        int count=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
               count++;
            }
        }
        if(count>1){
            System.out.println("Non prime");
        }
        else {
            System.out.println("Prime");
        }
    }
}
