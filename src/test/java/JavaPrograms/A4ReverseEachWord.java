package JavaPrograms;

public class A4ReverseEachWord {
    public static void main(String[] args) {
        String str="I am Pinnu Madhu Kiran";
        String[] sHere=str.split(" ");
        String reverse="";
        for(String word: sHere){
            String revWord="";
            for (int i=word.length()-1;i>=0;i--){
                revWord=revWord+word.charAt(i);
            }
            reverse=reverse+" "+revWord;
        }
        System.out.println(reverse);
    }
}
