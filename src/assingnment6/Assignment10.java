package assingnment6;

/*10)Getting the first and last n letters from a word where wordlength > 2n.
Ex: Input: california,3.
    output: calnia.*/
    
public class Assignment10 {

	public static void main(String[] args) {
	
		String s = "california";
//-------------------------------------------------------------------------
		int no =3;String n = "";
		for(int i=0;i<no;i++)
		{
			n = n + s.charAt(i);
		}
		for(int i = s.length()-no;i<s.length();i++)
		{
			n = n + s.charAt(i);
		}System.out.println(n);
		
		
		
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------		
		/*String s1="";
		
		for(int i=0;i<3;i++)
		{
			s1=s1+s.charAt(i);
		}
		for(int i=s.length()-3;i<s.length();i++)
		{
			s1=s1+s.charAt(i);
		}System.out.println(s1);*/
		
	}

}
