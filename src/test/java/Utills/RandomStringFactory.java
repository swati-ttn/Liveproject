package Utills;
import java.util.UUID;

public class RandomStringFactory 
{
	public static String usingUUID()
	{
	    UUID randomUUID = UUID.randomUUID(); 
	    return randomUUID.toString().replaceAll("-", ""); 
	  } 
	}

