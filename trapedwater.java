import java.util.*;
public class trapedwater {

        public static int trap(int h[],int n){
            int leftmax[] = new int[n];
            int rightmax[] = new int[n];
            leftmax[0] = h[0];
            for(int i=1;i<n;i++){
                leftmax[i] = Math.max(leftmax[i-1],h[i]);
            }
            rightmax[n-1] = h[n-1];
            for(int i=n-2;i>=0;i--){
                rightmax[i] = Math.max(rightmax[i+1],h[i]);
            }
            int trappedwater = 0;
            for(int i=0;i<n;i++){
                trappedwater += Math.min(leftmax[i],rightmax[i]) - h[i];
            }
            return trappedwater;

        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array");
            int n = sc.nextInt();
            int h[] = new int[n];
            System.out.println("Enter the elements of array");
            for(int i=0;i<n;i++){
                h[i] = sc.nextInt();
            }
            int result = trap(h,n);
            System.out.println("The total trapped water is: " + result);
            sc.close();
            
            

        }
}
