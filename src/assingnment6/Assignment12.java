package assingnment6;

/*12)Add elements of digits:9999 
output:9+9+9+9=3+6=9;*/

public class Assignment12 {

	public static void main(String[] args) {

		int no = 9999;
		int ans = 0 ;
		while(no!=0)
		{
			int x = no % 10;
			ans = ans + x;
			no  = no /10;
		}
		int n = 0;
		if(ans>=0 && ans<=9)
		{
			System.out.println(ans);
		}
		else
		{
			while(ans!=0)
			{
				int x = ans % 10;
				n = n + x;
				ans  = ans /10;
			}System.out.println(n);
		}
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------		
		/*int a=999999999; 		int ans= 0 ;
		int sum=0;		
		while(a>0)
		{
			sum=sum+a%10;
			a=a/10;
		}
		if(sum>='0'&&sum<='9')
		{
			System.out.println(sum);
		}
		else 
		{
			while(sum>0)
			{
				ans = ans+(sum%10);
				sum=sum/10;
			}
			
		}System.out.println(ans);*/
	}

}
