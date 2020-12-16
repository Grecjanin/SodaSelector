package sodas;

import javax.swing.JFrame;

import org.kie.api.KieServices;
import org.kie.api.logger.KieRuntimeLogger;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	KieRuntimeLogger kLogger = ks.getLoggers().newFileLogger(kSession, "sodas");
        	
        	kSession.setGlobal( "frame", new JFrame() );
			

            // go !
            
            kSession.fireAllRules();
            
            kLogger.close();
        } catch (Throwable t) {
            t.printStackTrace();
        }

	}

}
