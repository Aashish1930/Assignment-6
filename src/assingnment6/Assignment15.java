package assingnment6;

import java.util.HashMap;
import java.util.Map;

/*15)Input1=845.69, output=3:2;
Input1=20.789; output=2:3;
Input1=20.0; output=2:1;  
output is in Hashmap format.
Hint: count the no of digits.*/

public class Assignment15 {

	public static void main(String[] args) {
//-------------------------------------------------------------------------
		float no = 2601.22f;
		String n = String.valueOf(no);
		int l = 0 ;
		for(int i=0;i<n.length();i++)
		{
			if(n.charAt(i)=='.')
			{
				l = i;
			}
		}
		
		int key = l  - 0 ;
		int value = n.length() - (l+1);
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		hm.put(key, value);
		
		for(Map.Entry<Integer,Integer> me : hm.entrySet())
		{
			System.out.println(me.getKey()+"\t"+me.getValue());
		}
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------		
		/*double d = 845.69;
		String s = Double.toString(d);	
		char c = '.'; 		int location = 0;
		int no=0,no1=0;
		for(int i=0;i<s.length();i++)
		{
			if(c==s.charAt(i))
			{
				location=i;
			}
		}
		for(int i=0;i<location;i++)
		{
			no++;
		}
		for(int i=location+1;i<s.length();i++)	
		{
			no1++;
		}
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		hm.put(no,no1);
		
		for(Map.Entry me : hm.entrySet())
		{
			System.out.println(me.getKey() +":"+me.getValue());
		}*/
	}

}
