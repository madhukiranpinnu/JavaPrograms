package JavaPrograms;

public class A11ArmStrong {
    public static void main(String[] args) {
        int pol=153;
        int arm=0;
        int fin=pol;
        while (pol>0){
            int a=pol%10;
            arm=arm+a*a*a;
            pol=pol/10;
        }
      if(fin==arm){
          System.out.println("Armstrong number");
      }
      else {
          System.out.println("Not a armstrong");
      }
    }
}
