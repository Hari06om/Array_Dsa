import java.util.*;
public class linersearch{
    public static void input(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void display(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void search(int arr[],int n,int key){
        for(int i=0;i<n;i++){
            if(arr[i] == key){
                System.out.println("Element found at index "+i);
                return;
            }
        }
        System.out.println("Element not found");
    }

        public static void main(String args[]){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the size of array");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements of array");

            input(arr,n);
            display(arr,n);
            System.out.println("Enter the element to be searched");
            int key = sc.nextInt();

            search(arr,n,key);
            
        }
}