
package week_1;
        import java.util.Scanner;
public class Insertion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
                System.out.print("Enter the size of an array: ");
                int n=s.nextInt();
                int[] arr=new int[n+1];
                System.out.print("Enter the elements of an array: ");
                for (int i=0;i<n;i++){
                    arr[i]=s.nextInt();
                }
                System.out.println("Entered elements of an array: ");
                for(int i=0;i<n;i++){
                    System.out.print(arr[i] +" | ");
                }
                System.out.println();
                
                System.out.print("Enter the index you want to insert: ");
                int index=s.nextInt();
               for(int i=n;i>=index;i--){
                       arr[i]=arr[i-1];
               }
               int val=30;
               arr[index]=val;
                n+=1;
          System.out.println("Array after insertion: ");
           for(int i=0;i<n;i++){
               System.out.print(arr[i]+" | ");
           }
    }
    
}