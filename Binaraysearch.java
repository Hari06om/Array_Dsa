package Array_Dsa;
import java.util.*;
public class Binaraysearch{
    // Function to input elements into the array
    public static void input(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }

    // Function to display elements of the array
    public static void display(int arr[],int n){
        System.out.println("The elements of the array are:");
        for(int i = 0 ;i< n;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    // Function to perform binary search
    // Returns the index of the element if found, otherwise returns -1
    public static int  Binaraysearch(int arr[] ,int n, int k){
        int s = 0;int e = n-1;
        while (s<e){
            int m = (s + e) / 2;
            if(arr[m] ==k){
                return m;
            }  
            if(arr[m] < k){
                s = m + 1;
            } else {
                e = m - 1;
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
        // display(arr, n);
        // sort
        Arrays.sort(arr);
        System.out.println("Sorted array:");
        display(arr, n);
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
        System.out.println("The element is at this index {the index is start point is 0} " + Binaraysearch(arr, n, key));
    }
}