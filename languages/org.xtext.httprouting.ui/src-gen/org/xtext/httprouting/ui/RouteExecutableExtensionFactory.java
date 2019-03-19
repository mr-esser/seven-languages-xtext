/*
 * generated by Xtext 2.17.0
 */
package org.xtext.httprouting.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.httprouting.ui.internal.HttproutingActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RouteExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(HttproutingActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		HttproutingActivator activator = HttproutingActivator.getInstance();
		return activator != null ? activator.getInjector(HttproutingActivator.ORG_XTEXT_HTTPROUTING_ROUTE) : null;
	}

}
