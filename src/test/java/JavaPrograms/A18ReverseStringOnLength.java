package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class A18ReverseStringOnLength {
    public static void main(String[] args) {
        String s="Madhu is here only";
        String str[]=s.split(" ");
        String strrev=s.replace(" ","");
        StringBuilder rev= new StringBuilder(strrev);
        rev=rev.reverse();
        String reversed= String.valueOf(rev);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< str.length;i++){
            map.put(i,str[i].length());
        }
        String rever;
        String mad="";
        for(int i= strrev.length()-1;i>=0;i--){
         for(Map.Entry<Integer,Integer> ma1:map.entrySet()){
             String here="";
             for(int j=0;j<ma1.getValue()-1;j++){
                 here=here+strrev.charAt(i);
             }
             mad=mad+" "+here;
         }
        }
        System.out.println(mad);
    }
}
