import java.util.*;
public class pairofaraay {
    public static void input(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the array: ");
        for(int i= 0;i<n;i++){
            arr[i]= sc.nextInt();
            
        }
    }
    public static void display(int arr[],int n){
        System.out.print("The elements of the array are: ");
        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void pairofaraay(int arr[],int n){
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == 0){
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    count++;
                }
            }
        }
        if(count == 0){
            System.out.println("No pairs found with sum zero.");
        }



        
    }   
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int arr[] = new int[n];
        int arr[] = new int[n]; // Example size, can be changed
        input(arr, n);
        display(arr, n);
        System.out.println();
        pairofaraay(arr, n);
        System.out.println("Thank you for using this program");
        
    }
}
