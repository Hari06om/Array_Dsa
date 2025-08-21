import java.util.*;
public class Binarysearch{


    public static void input(int arr[] , int n ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i = 0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }
    }

    public static void display(int arr[] , int n){
        System.out.println("The elements of the array are:");
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int  Binarysearch(int arr[] ,int n ,int k){
        int  s = 0 ; int e = n -1;
        while(s<=e){
            int m = (s+e)/2;
            if(arr[m] == k){
                return m ;

            }
            if(arr[m] < k){
                s = m+1;
            }
            else{
                e =m-1;
            }


        } 
        return -1; // Element not found
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        input(arr, n);
        Arrays.sort(arr); // Ensure the array is sorted for binary search
        display(arr, n);
        System.out.print("Enter the element to search: ");
        int k = sc.nextInt();
        int result = Binarysearch(arr, n, k);
        if(result != -1){
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        System.out.println("The array after searching is:" +Arrays.binarySearch(arr, k));
        sc.close();
    }


}