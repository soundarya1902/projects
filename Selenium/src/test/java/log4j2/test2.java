package log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class test2 
{
	private static final Logger log = LogManager.getLogger(test2.class.getName());
	public static void main(String[] args)
	{
		log.debug("This is debugging");
		//log.info("This is info");
		log.fatal("This is fatal");
		log.error("This is error");
		
	}
}
