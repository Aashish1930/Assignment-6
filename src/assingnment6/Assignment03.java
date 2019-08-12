package assingnment6;

/*3)i/p1: new york
i/p2: new jersey
o/p: new y+r+*/

public class Assignment03 {

	public static void main(String[] args) {
		
		String s =  "new york";
		String s1 = "new jersey";
//---------------------------------------------------------------------------
		String n = "";
		
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)//baki
			{
				n = n + s.charAt(i);
			}
			else
			{
				if(s.charAt(i)==s1.charAt(i))
				{
					n = n + s.charAt(i);
				}
				else
				{
					n = n + "+";
				}
			}
		}System.out.println(n);
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------		
		/*String s3="";
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				if(s.charAt(i)==s1.charAt(i))
				{
					s3=s3+s.charAt(i);
				}
				else
				{
					s3=s3+s.charAt(i);
				}
			}
			else
			{
				if(s.charAt(i)==s1.charAt(i))
				{
					s3=s3+s.charAt(i);
				}
				else
				{
					s3=s3+"+";
				}
			}
		}System.out.println(s3);*/
		
		
		
	}

}
