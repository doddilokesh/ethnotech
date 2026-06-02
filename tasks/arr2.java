import java.util.*;
class arr2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elemnets:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int avg=sum/n;
        System.out.println("avg is "+avg);
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maxmimum is "+max);
        int min=arr[i];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min is "+min);
        
    }
}