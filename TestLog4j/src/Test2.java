import org.apache.commons.logging.Log;

import com.jd.jdpc.common.LOG;

public class Test2 {
	public static void main(String[] args) {

		Log log = LOG.getLog("log", "test", Test2.class);
		log.info("-     -----");
		log.debug("=    ======");
        System.out.println("-----------------");
	}
}
