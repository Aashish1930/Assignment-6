package assingnment6;

import java.util.LinkedHashSet;

/*7) ip: "this is sample test case"
    op: "this amplec"
    remove the duplicates in the given string*/
    
public class Assignment07 {

	public static void main(String[] args) {
	
		String s = "this is sample test case";
//-------------------------------------------------------------------------
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			hs.add(c);
		}
		String nj = "";
		for(char n : hs)
		{
			nj = nj + n;
		}System.out.println(nj);
		
		
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------		
		/*LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		
		for(char c:hs)
		{
			System.out.print(c);
		}*/
	}

}
