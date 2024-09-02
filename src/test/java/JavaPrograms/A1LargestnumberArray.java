package JavaPrograms;

public class A1LargestnumberArray {
    public static void main(String[] args) {
        int[] artIn={1,6,8,9,78,89,67};
        int largest=artIn[0];
        for(int i=1;i<artIn.length;i++){
            if(largest<artIn[i]){
                largest=artIn[i];
            }
        }
        System.out.println(largest);
    }
}
