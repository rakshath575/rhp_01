import java.util.Scanner;

public class drone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        while(n-->0){
         
        
        int l=sc.nextInt();
            int k=sc.nextInt();
             int[] arr=new int[l+l+l+1];
        for(int i=0;i<l;i++){
            arr[sc.nextInt()]++;
        }
        int ans=0; 
           
            
            for(int i=1;i<=l+l;i++){
                int cur=i;

               while(arr[cur]>k) {arr[cur+1]=arr[cur]-1;
                arr[cur]=1;
                cur++;
                }
                ans=Math.max(ans,cur-i);
            }
            System.out.print(ans);
        }
    }
}
