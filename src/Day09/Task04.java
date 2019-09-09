package Day09;

public class Task04 
{
	/*
	 	HTTP is a protocol that governs communications between web servers and web
	 	clients (i.e. browsers).  Part of the protocol includes a status returned
	 	by the server to tell the browser the status of its most recent page request.
	 	Some of the codes and their meanings are listed below:
	 	
	 	Status code:
	 		200, OK
	 		201, Created
	 		202, Accepted
	 		301 Moved Permanently
	 		303 See Other
	 		
	 	1- Declare and int variable called StatusCode
	 	2- Write an if statement that prints out, on a line by itself, the appropriate
	 	   label from the above listed based on status.
	 */
	
	public static void main(String[]  args)
	{
		int StatusCode = 303;
		
		if (StatusCode != 200 && StatusCode != 201 && StatusCode != 202 && StatusCode != 301
		   && StatusCode != 303 && StatusCode != 304 && StatusCode != 307 && StatusCode != 400)
		{
		System.out.println("This Status Code " + StatusCode + " cannot be resolved");	
		}
		
		if (StatusCode == 200)
		{
		System.out.println("OK");
		}
		
		if (StatusCode == 201)
		{
		System.out.println("Created");
		}
		
		if (StatusCode == 301)
		{
		System.out.println("Moved Permanently");
		}
		
		if (StatusCode == 303)
		{
		System.out.println("See Other");
		}
		
		if (StatusCode == 304)
		{
		System.out.println("Not Modified");
		}
	}
	

}
