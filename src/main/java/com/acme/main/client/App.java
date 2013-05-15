package com.acme.main.client;

import com.google.inject.Inject;
import com.google.inject.Singleton;
//import com.chrisgammage.ginjitsu.client.AfterInject;

@Singleton
public class App {

   @Inject
   private Foo foo;

   public void run () {
      foo.foo ("Foo!!!");
   }

}
