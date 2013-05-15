package com.acme.main.client;

import java.util.logging.Logger;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.EntryPoint;

public class Main implements EntryPoint {

	private final Logger logger = Logger.getLogger (getClass ().getName ());

   private AppGinjector appGinjector = GWT.create (AppGinjector.class);

	@Override
	public void onModuleLoad () {

		//replace the following code with the test logic
		logger.warning ("REMOVE ME");

      appGinjector.getApp ().run ();
	}

}
