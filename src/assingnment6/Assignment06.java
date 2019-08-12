package assingnment6;

/*6)String format : CTS-LLL-XXXX
ip1: CTS-hyd-1234
ip2: hyderabad
-> LLL must be first 3 letters of ip2.
-> XXXX must be a 4-digit number*/

public class Assignment06 {

	public static void main(String[] args) {
		
		String n = "CTS-hyd-1234";
		
		String a[]=n.split("-");
		String ans=a[0]+"-";
		
		for(int i=1;i<a.length;i++)
		{
			String j = "hyderabad";
			String t = "";
			String x = a[i];
			if(x.length()==3)
			{
				for(int v=0;v<=2;v++)
				{
					ans=ans+j.charAt(v);
				}
			}
			
			else if(x.length()==4)
			{
				ans=ans+"-"+"1234";
			}
		}
		System.out.println(ans);
		
		
		
	}

}
