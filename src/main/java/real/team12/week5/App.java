package real.team12.week5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 * test
 */
public class App 
{
	private static Logger mLog;

	private App(){
		mLog = Logger.getLogger(App.class.getName());
    }
	
    public static void main( String[] args )
    {
    	mLog = Logger.getLogger(App.class.getName());
    	mLog.log(Level.INFO, "Cheer up!");
    }
}
