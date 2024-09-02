package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class A5DuplicatesInString {
    public static void main(String[] args) {
        String name="pinnu madhu kiran is present here";
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i=0;i<name.length();i++){
            if(!hashMap.containsKey(name.charAt(i))){
                hashMap.put(name.charAt(i),1);
            }
            else {
                hashMap.put(name.charAt(i),hashMap.get(name.charAt(i))+1);
            }
        }
        for (Map.Entry<Character,Integer> entry: hashMap.entrySet()){
           if(entry.getValue()>1){
               System.out.println(entry.getKey()+"========="+entry.getValue());
           }
        }
    }
}
