package assingnment6;

/*9)Find the Maximum span of the given array.
span is the number of elements between the duplicate element
including those 2 repeated numbers.
if the array as only one elemnt,then the span is 1.
input[]={1,2,1,1,3}
output1=4
input[]={1,2,3,4,1,1,5}
output1=6
*/

public class Assignment09 {

	public static void main(String[] args) {

		int n[]={1,2,1,1,3};
//-------------------------------------------------------------------------		
		int ans = 0 ;
		
		for(int i=0;i<n.length-1;i++)
		{
			int no = 0 ;
			for(int j=0;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
					no = j - i ;
				}
			}
			if(ans<no)
			{
				ans = no;
			}
		}System.out.println(ans+1);
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------		
		/*int temp=0,ans=0;
		for(int i=0;i<n.length-1;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
					int loc1=i;
					int loc2=j;
					temp=loc2-loc1;
				}
			}
			
			if(ans<temp)
			{
				ans=temp;
			}
		}System.out.println(ans+1);*/
	}

}
