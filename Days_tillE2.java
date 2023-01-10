public class date_calc
{
    public static void main(String args[])
    {
        int date,month,year;
        String input=;
	
	//Converting date to string
	String date_a_str=String.valueOf(input.charAt(0));
	String date_b_str=String.valueOf(input.charAt(1));
	String date_combined=date_a_str+date_b_str;	// String of date
	date=Integer.parseInt(date_combined);		// Integer Of Date
	// Was already declared as int above 

	// Converting month to string
	String month_a_str=String.valueOf(input.charAt(2));
	String month_b_str=String.valueOf(input.charAt(3));
	String month_combined=month_a_str+month_b_str;	// String of month
	month=Integer.parseInt(month_combined);

	// Converting Year to string
	String year_a_str=String.valueOf(input.charAt(4));
	String year_b_str=String.valueOf(input.charAt(5));
	String year_c_str=String.valueOf(input.charAt(6));
	String year_d_str=String.valueOf(input.charAt(7));
	String year_combined=year_a_str+year_b_str+year_c_str+year_d_str;	//String of year
	year=Integer.parseInt(year_combined);


	// We have converted the input of string to an integer value of day, month and year.
	// Time to calculate

	int days=0;
	for(int i=1970 ; i<=year ; i++) 
	{
		if (year!=i)
		{
			int y=i/4;
			int z=y*4;

			if(z==i)	// Means this is a leap year
			{
				days+=366;
			}
		

			else
			{
				days+=365;
			}
		}
		else 
		{
			int y=i/4;
			int z=y*4;
			
			if(z==i)	//leap year
			{
				switch(month)
				{
					case 01: days+=0; break;
					case 02: days+=31; break;
					case 03: days+=60; break;
					case 04: days+=91; break;
					case 05: days+=121; break;
					case 06: days+=152; break;
					case 07: days+=182; break;
					case 8: days+=213; break;
					case 9: days+=244; break;
					case 10: days+=274; break;
					case 11: days+=305; break;
					case 12: days+=335; break;
				}
			}
			else		//Not a leap year
			{
				switch(month)
				{
					case 01: days+=0; break;
					case 02: days+=31; break;
					case 03: days+=59; break;
					case 04: days+=90; break;
					case 05: days+=120; break;
					case 06: days+=151; break;
					case 07: days+=181; break;
					case 8: days+=212; break;
					case 9: days+=243; break;
					case 10: days+=273; break;
					case 11: days+=304; break;
					case 12: days+=334; break;
				}
			}
		
		// Now we are onlt left with the days of current month

		days+=date;
		//Printing the result

		System.out.println("Total "+(days-1)+" days have passed from 01 jan 1970"+" to "+date+" "+month+" "+year);
		System.out.println(date+" "+month+" "+year+" is the "+days+"th day.");	
	}	
	}	
    }
}
