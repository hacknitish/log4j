package com.hsbc.rnd.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{	
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	LOG.trace("We've just greeted the user!");
    	LOG.debug("We've just greeted the user!");
    	LOG.info("We've just greeted the user!");
    	LOG.warn("We've just greeted the user!");
    	LOG.error("We've just greeted the user!");
    	LOG.fatal("We've just greeted the user!");
    }
}
