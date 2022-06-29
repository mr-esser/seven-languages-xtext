/**
 * generated by Xtext 2.11.0-SNAPSHOT
 */
package org.xtext.template.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.template.TemplateRuntimeModule;
import org.xtext.template.TemplateStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class TemplateIdeSetup extends TemplateStandaloneSetup {
  @Override
  public Injector createInjector() {
    TemplateRuntimeModule _templateRuntimeModule = new TemplateRuntimeModule();
    TemplateIdeModule _templateIdeModule = new TemplateIdeModule();
    return Guice.createInjector(Modules2.mixin(_templateRuntimeModule, _templateIdeModule));
  }
}