package interview;

public class rotated {

	public static void main(String[] args) {
		int[] a=new int[] {1,2,3,4,5};
		int order=3;int temp;int n=7;
		//for(int i=0;i<order;i++)
		//{ 

           // while(i<4)
		for(int i=0;i<4;i++){
		//	while(j<4)
			for(int j=0;j<4;j++){	temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
			}}
		
			
			
			
			for(int k=0;k<5;k++)
				System.out.print(a[k]);
	}

}
