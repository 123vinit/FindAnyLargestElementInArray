import java.util.*;
public class FindAnyLargestElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter lenght of an array:");
        int len= sc.nextInt();
        // create an array
        int[] array=new int[len];

        //input element
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element"+(i+1)+":");
            array[i]= sc.nextInt();
        }
        System.out.println("Elements of an array"+Arrays.toString(array));
        System.out.print("Enter nubber of largest element you want to find:");
        int largestElement= sc.nextInt();

        // sorting process
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                     //compare
                     if(array[j+1]<array[j]){
                         int t=array[j];
                         array[j]=array[j+1];
                         array[j+1]=t;
                     }
            }
        }
         int find=array.length-largestElement;
        System.out.println(largestElement+" Largest Element in an array is:"+array[find]);
    }
}
