package assingnment6;

/*4)input1={2,4,3,5,6};
if odd  find square 
if even find cube
finally add it
output1=208(4+16+27+125+36)*/

public class Assignment04 {

	public static void main(String[] args) {
		
		int a[]={2,4,3,5,6};
//-------------------------------------------------------------------------		
		double ans = 0 ;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				ans = ans + Math.pow(a[i],2);
			}
			else
			{
				ans = ans + Math.pow(a[i],3);
			}
		}System.out.println((int)ans);
		
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------		
		/*double sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				sum=sum+(Math.pow(a[i],3));
			}
			else
			{
				sum=sum+(Math.pow(a[i],2));
			}
		}System.out.println(((int)sum));*/
		
		
	}

}
