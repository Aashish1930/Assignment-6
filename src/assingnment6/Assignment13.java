package assingnment6;

import java.time.Year;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;

/*13)leap year or not using API?*/

public class Assignment13 {

	 
	public static void main(String[] args) {
//--------------------------------------------------------------------------		
		/*Calendar d  = Calendar.getInstance();
		int year = d.get(Calendar.YEAR);
		
		Year y = Year.of(year);
		
		if(y.isLeap())
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------		
		/*Date d = new Date();
		int year = 1900+d.getYear();
		//int year = 2019;
		Year y = Year.of(year);
		
		if(y.isLeap())
		{
			System.out.println(year+" is leap year");
		}
		else
		{
			System.out.println(year+" is not a leap year");
		}*/
		
		
//-----------------------------------------------------------------------		
		int year=2000;
		
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not leap year");
		}
	
		
	}

}
