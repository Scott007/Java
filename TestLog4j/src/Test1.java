import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Test1 {

	public static void main(String[] args) {

		//Log log = LOG.getLog("log", "test", Test1.class);
		Log logger1 = LogFactory.getLog("mylogger1");
		Log logger2 = LogFactory.getLog("mylogger2");

		logger1.info("11------------------");
		logger1.debug("11==================");
		
		logger2.info("22------------------");
		logger2.debug("22==================");
        System.out.println("-----------------");
	}
}
