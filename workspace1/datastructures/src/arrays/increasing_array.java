package arrays;


import java.util.*;

public class increasing_array {

    public static void main(String args[]){
        
          
    int c=0;

    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    int i[][]=new int[n+1][n+1];
    
    
    for(int k=1;k<=n;k++){
        for(int l=1;l<=n;l++){
            i[k][l]=sc.nextInt();
            if(isPrime(i[k][l])){
                c++;
            }
        }
    }
    
    for(int a=1;a<=n;a++){
        for(int b=1;b<=n;b++){
           for(int m=1;m<n;m++) {
            if(a+m<=n && b+m<=n){
                if(isPrime(i[a][b])&&  isPrime(i[a][b+m]) && isPrime(i[a+m][b]) && isPrime(i[a+m][b+m])){
                    c++;
                }
            }
           }
            
        }
        
    }
    
    System.out.println(c+"");
    
    }
    
    
    
    public static Boolean isPrime(int num){
        
        int temp;
        
          if(num==1 || num==0){
               return false;
           }
           
          
        for(int i=2;i<=num/2;i++)
        {
               temp=num%i;
               
           if(temp==0)
           {
              return false;
           }
        }
        
        
        return true;
    }
}



