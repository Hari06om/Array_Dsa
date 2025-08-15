import java.util.Scanner;

public class LargestNo{

   public static void input(int arr[],int n){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the elements of the array:");
      for(int i=0 ;i<n;i++){
         arr[i] = sc.nextInt();
      }
   }
   public static void display(int arr[],int n){
      System.out.println("The elements of the array are:");
      for(int i=0 ;i<n;i++){
         System.out.print(arr[i] + " ");
      }
      System.out.println();
   }
   public static void large(int arr[] ,int n){
      int mx = Integer.MIN_VALUE; // Initialize to the smallest possible integer
      int sx = Integer.MAX_VALUE; // Initialize to the smallest possible integer
      System.out.println("Finding the largest number in the array:");
      for(int i =0;i<n;i++){
         if(arr[i]>mx){
            mx =arr[i];
         }
         if(arr[i]<sx){
            sx =arr[i];
         }
      }
      System.out.println("The largest number in the array is: " + mx);
      System.out.println("The smallest number in the array is: " + sx);
   }
      public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
         System.out.print("Enter the number of elements in the array: ");
         int n = sc.nextInt();
         int arr[] = new int[n];
         input(arr, n);
         display(arr, n);
         large(arr, n);
         sc.close(); 
   }
}