package JavaPrograms;

public class A3ReverseString {
    public static void main(String[] args) {
        String str="Madhukiran Pinnu";
        char[] stCh=str.toCharArray();
        String rev="";
        for(int i=stCh.length-1;i>=0;i--){
           rev=rev+stCh[i];
        }
        System.out.println(rev);
    }
}
