package com.acme.main.client;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class Bar {

   private Foo foo;

   @Inject
   public void setFoo (Foo foo) {
      this.foo = foo;
   }

}
