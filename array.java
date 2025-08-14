package Array_Dsa;
import java.util.*;


public class array {    
        public static void arr(int marks[]){
            for(int i=0;i<marks.length;i++){
                marks[i] = marks[i] + 1;
            }
      }
        public static void display(int marks[]){
            for(int i=0;i<marks.length;i++){
                System.out.print(marks[i] + " ");
            }
            System.out.println();
        }
        public static void input(int marks[]){
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<marks.length;i++){
                System.out.print("Enter marks for subject " + (i+1) + ": ");
                marks[i] = sc.nextInt();
            }
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();
        int marks[] = new int[n];
        input(marks);

        arr(marks);
        // want to sort
        Arrays.sort(marks);
        System.out.println("Sorted marks after incrementing:");
        // Display the sorted array
        System.out.println("Marks after incrementing by 1:");
        
        display(marks);
        sc.close();
    }
}
