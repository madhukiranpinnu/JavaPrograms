package JavaPrograms;

public class A2SecondLargestArray {
    public static void main(String[] args) {
        int[] arIn={1,5,6,7,3,90,78,45,89,37,98};
        int largest=arIn[0];
        int secondlargest=arIn[0];
        for(int i=1;i<arIn.length;i++){
            if(largest<arIn[i]){
                secondlargest=largest;
                largest=arIn[i];
            }
            else  if (secondlargest<arIn[i]){
                secondlargest=arIn[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondlargest);
    }
}
