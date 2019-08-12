package assingnment6;

/*2)find the maximum chunk of a given string
i/p: this isssss soooo good
o/p=5*/

public class Assignment02 {

	public static void main(String[] args) {
	
		String n = "this issss sssssoooooo good";
		int count=0,ans=0;
		for(int i=0;i<n.length()-1;i++)
		{
			if(n.charAt(i)==n.charAt(i+1))
			{
				count++;
			}
			else
			{
				count=0;
			}
			
			if(ans<count)
			{
				ans = count;
				//System.out.println(ans);
			}
		}System.out.println(ans+1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String a[]=n.split(" ");
		int ans=0;
		for(int i=0;i<a.length;i++)
		{*/
			/*String s = "this issss sooooo good";
			int count=0;int ans=0;
			for(int j=0;j<s.length()-1;j++)
			{
				
				if(s.charAt(j)==s.charAt(j+1))
				{
					count++;
				}
				else
				{
					count=0;
				}
				if(ans<count)
				{
					ans=count;
					
				}
			}
		System.out.println(ans+1);
*/	
	
	
	
	
	
	
	}
}
