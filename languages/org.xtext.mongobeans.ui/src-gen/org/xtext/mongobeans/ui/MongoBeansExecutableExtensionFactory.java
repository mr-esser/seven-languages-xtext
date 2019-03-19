/*
 * generated by Xtext 2.17.0
 */
package org.xtext.mongobeans.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.mongobeans.ui.internal.MongobeansActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MongoBeansExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(MongobeansActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		MongobeansActivator activator = MongobeansActivator.getInstance();
		return activator != null ? activator.getInjector(MongobeansActivator.ORG_XTEXT_MONGOBEANS_MONGOBEANS) : null;
	}

}
