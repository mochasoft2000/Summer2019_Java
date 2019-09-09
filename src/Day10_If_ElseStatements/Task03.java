package Day10_If_ElseStatements;

public class Task03 
{

	public static void main(String[]   args)
	{
	
	int hours = 0;
	int minutes = 45;
	int seconds = 59;
	
	

	if (hours > 24 || hours < 0 || minutes < 0 || seconds < 0 || minutes > 59 || seconds > 59)
	{
	System.out.println("input is invalid");
	}
	
	if (hours == 0 && minutes <= 59 && seconds <= 59)
	{
	System.out.println("The time is " + hours + ":" + minutes +":" + seconds + " am");
	}
	
	if (hours < 12 && hours > 0 && minutes <= 59 && seconds <= 59)
	{
	System.out.println("The time is " + hours + ":"  + minutes +":" + seconds + " am");
	}
	
	if (hours >12 && minutes <= 59 && seconds <= 59)
	{
	System.out.println("The time is " + (hours -12) + ":"  + minutes +":" + seconds + " pm");
	}
	
	if (hours == 12 && minutes <= 59 && seconds <= 59)
	{
	System.out.println("The time is " + hours + ":"  + minutes +":" + seconds + " noon");
	}
	
	
	
	
	}
	
}
