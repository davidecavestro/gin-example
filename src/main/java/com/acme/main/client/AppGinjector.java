package com.acme.main.client;

import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.inject.client.GinModules;

/*
@GinExtensions({ @GinExtension(clazz = TestObjectImpl.class,
                           generator = TestGenerator.class),
             @GinExtension(clazz = AssistedObjImpl.class,
                           generator = TestGenerator.class)})
*/
@GinModules(AppClientModule.class)
public interface AppGinjector extends Ginjector {
  App getApp();
}
