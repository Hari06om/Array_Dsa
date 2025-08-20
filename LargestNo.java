import java.util.*;
public class LargestNo{

    public static void input(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
    }
    public static void display(int arr[],int n){
        System.out.println("The elements of the array are:");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void large(int arr[],int n){
        int max = arr[0];
        for(int i = 0;i<n;i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        System.out.println("\nThe largest number in the array is: " + max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        input(arr, n);
        display(arr, n);
        large(arr, n);
        sc.close();
    }
}