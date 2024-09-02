package JavaPrograms;

import java.util.HashMap;

public class A8WordsInString {
    public static void main(String[] args) {
        String str="here is madhu kiran and madhu";
        String[] strWord=str.split(" ");
        HashMap<String,Integer> hashMap=new HashMap<>();
        for(String word:strWord){
           if(!hashMap.containsKey(word)){
               hashMap.put(word,1);
           }
           else {
               hashMap.put(word,hashMap.get(word)+1);
           }
        }
        System.out.println(hashMap);
    }
}
