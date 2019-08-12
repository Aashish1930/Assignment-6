package assingnment6;

/*1)i/p: bengal
o/p: ceogbl
if z is there replace with a*/

public class Assignment01 {

	public static void main(String[] args) {
		
		String s = "bengal"; 
//-------------------------------------------------------------------------		
		String n = "";
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c=='z')
			{
				n = n + 'a';
			}
			else
			{
				int no = (int) c;
				char nj = ((char) (no+1));
				n = n + nj;
			}
		}System.out.println(n);
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------		
		/*String s1="";
		
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				if(s.charAt(i)=='z')
				{
					s1=s1+'a';
				}
				else
				{
					int no = (int) s.charAt(i);
					char c1=(char) (no+1);
					int n=no+1;
					char c = (char) n;
					s1=s1+c1;
				}
			}
			else
			{
				s1=s1+s.charAt(i);
			}
		}System.out.println(s1);*/
		
		
		
		
	}

}
