package assingnment6;

/*11)input1="aBrd";
input2="aqrbA";
input3=2;
output1=boolean true;
2nd char of ip1 and last 2nd char of ip2 show be equal*/

public class Assignment11 {

	public static void main(String[] args) {
		
		String s1 = "aBrd";		
		String s2="aqrbA";	
//-------------------------------------------------------------------------		
		int no = 2;
		char c1 = Character.toLowerCase(s1.charAt(no-1));
		char c2 = Character.toLowerCase(s2.charAt(s2.length()-no));
		
		if(c1==c2)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
		
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------		
		/*String c1 =""; 		c1=c1+s1.charAt(s1.length()-2);
		String  c=""; 		c=c+s.charAt(1);
		if(c.equalsIgnoreCase(c1))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}*/
		
		
	}

}
