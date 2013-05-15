package com.acme.main.client;

import java.util.logging.Logger;

import com.google.gwt.core.client.GWT;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class Foo {
   private final Logger logger = Logger.getLogger (getClass ().getName ());

   private Bar bar;

   @Inject
   public void setBar (Bar bar) {
      this.bar = bar;
   }

   public void foo (final String msg) {
      GWT.log ("Foo says: "+msg);
      logger.warning ("Foo says: "+msg);
   }
}
